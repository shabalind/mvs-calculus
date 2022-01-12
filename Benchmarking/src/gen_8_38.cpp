  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    double p0;
    std::vector<s0> p1;
    s2(double v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    s2 p1;
    s4(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    double p0;
    std::vector<s4> p1;
    s9(double v0, std::vector<s4> v1): p0(v0), p1(v1) { }
  };
  struct s12 {
    s0 p0;
    s4 p1;
    s12(s0 v0, s4 v1): p0(v0), p1(v1) { }
  };
  s4 f119(const s4 &v0) {
    s4 v1 = v0;
    s4 v6 = v0;
    const s2 v7 = v6.p1;
    s2 v2 = v7;
    s2 v4 = v7;
    s4 v8 = v1;
    const std::vector<s0> v3 = v4.p1;
    std::vector<s0> v10 = v3;
    const std::vector<s0> v11 = v4.p1;
    const double v5 = v4.p0;
    const s0 v12 = v3[1];
    v6.p1 = v2;
    const s2 v16 = v8.p1;
    v4 = v2;
    v4 = v7;
    v2.p0 = v5;
    v6.p1 = v4;
    const std::vector<s0> v43 = v16.p1;
    v8.p1 = v2;
    v8.p1 = v4;
    const double v34 = v4.p0;
    v10 = v11;
    const s0 v24 = v43[0];
    v1.p1 = v16;
    v10[0] = v12;
    v4.p1 = v3;
    v2.p1 = v3;
    v4.p1 = v10;
    v4.p1 = v10;
    s4 v37 = v0;
    v4.p0 = v34;
    v37.p1 = v7;
    v10[1] = v24;
    const s12 v203(v24, v37);
    const s4 v129 = v203.p1;
    v10[1] = v24;
    v2.p0 = v34;
    v1.p1 = v7;
    return v129;
  }
  std::vector<s4> f109(const std::vector<s4> &v0) {
    const s4 v2 = v0[0];
    const s4 v6 = f119(v2);
    const s4 v8 = f119(v6);
    const s4 v1 = v0[0];
    const s4 v10 = f119(v1);
    std::vector<s4> v9 = v0;
    v9[0] = v2;
    const s4 v26 = f119(v1);
    std::vector<s4> v23 = v0;
    v9[0] = v8;
    v9[0] = v26;
    const s4 v87 = f119(v10);
    std::vector<s4> v121 = v9;
    v23[0] = v87;
    std::vector<s4> v78 = v23;
    v23 = v121;
    v23[0] = v1;
    return v78;
  }
  s9 f75(const s9 &v0) {
    s9 v4 = v0;
    s9 v2 = v4;
    const std::vector<s4> v5 = v4.p1;
    v4 = v2;
    const std::vector<s4> v1 = f109(v5);
    const std::vector<s4> v8 = f109(v5);
    const double v6 = v2.p0;
    const s9 v9(v6, v8);
    std::vector<s4> v11 = v1;
    const std::vector<s4> v3 = v4.p1;
    const std::vector<s4> v7 = f109(v3);
    v4.p0 = v6;
    const s4 v17 = v11[0];
    const s4 v21 = v5[0];
    v11[0] = v21;
    v11[0] = v17;
    v11[0] = v17;
    v11[0] = v17;
    const s4 v26 = f119(v17);
    std::vector<s4> v12 = v7;
    v11[0] = v17;
    const double v37 = v4.p0;
    v12[0] = v26;
    v11[0] = v21;
    v12[0] = v26;
    const s9 v59(v6, v8);
    s4 v20 = v17;
    const std::vector<s4> v42 = f109(v12);
    const s9 v19(v37, v1);
    s9 v34 = v9;
    const s4 v24 = f119(v20);
    const std::vector<s4> v46 = v34.p1;
    v4 = v19;
    v34.p1 = v42;
    v4 = v59;
    const std::vector<s0> v54 = v21.p0;
    v2.p1 = v46;
    const s4 v58 = f119(v24);
    v12[0] = v58;
    v34.p0 = v37;
    v11[0] = v26;
    const double v48 = v0.p0;
    v4.p0 = v6;
    v4.p0 = v48;
    v2.p1 = v5;
    v20.p0 = v54;
    v20.p0 = v54;
    return v34;
  }
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    const s9 v5 = f75(v0);
    const std::vector<s4> v11 = v5.p1;
    const std::vector<s4> v13 = f109(v11);
    const s4 v18 = v13[0];
    const s2 v20 = v18.p1;
    const double v44 = v20.p0;
    double v53 = v44;
    double v179 = v53;
    return v179;
  }
  int main() {
    s9 v0({ 0.0, { { { { { { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { 5.0, { { { { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } } } } } } } });
    double v1(14.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
