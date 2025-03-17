package cn.leijiba.spring.transaction;

public interface AccountService {
    void testRequired();
    void testRequiresNew();
    void testSupports();
    void testNotSupported();
    void testMandatory();
    void testNever();
    void testNested();
}
