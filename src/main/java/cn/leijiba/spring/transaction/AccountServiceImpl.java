package cn.leijiba.spring.transaction;

import cn.leijiba.spring.transaction.propagation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private REQUIRED required;

    @Autowired
    private REQUIRES_NEW requiresNew;

    @Autowired
    private SUPPORTS supports;

    @Autowired
    private NOT_SUPPORTED notSupported;

    @Autowired
    private MANDATORY mandatory;

    @Autowired
    private NEVER never;

    @Autowired
    private NESTED nested;

    @Override
    public void testRequired() {
        required.requiredMethod();
    }

    @Override
    public void testRequiresNew() {
        requiresNew.requiresNewMethod();
    }

    @Override
    public void testSupports() {
        supports.supportsMethod();
    }

    @Override
    public void testNotSupported() {
        notSupported.notSupportedMethod();
    }

    @Override
    public void testMandatory() {
        mandatory.mandatoryMethod();
    }

    @Override
    public void testNever() {
        never.neverMethod();
    }

    @Override
    public void testNested() {
        nested.nestedMethod();
    }
} 