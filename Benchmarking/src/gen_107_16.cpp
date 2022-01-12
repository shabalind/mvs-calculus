  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    s2 p1;
    s5(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  s0 f63(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<double> v1 = v3[0];
    const std::vector<std::vector<double>> v5 = v0.p0;
    s0 v7 = v0;
    const std::vector<std::vector<double>> v9 = v7.p1;
    std::vector<std::vector<double>> v4 = v5;
    const std::vector<double> v11 = v3[1];
    v4[0] = v11;
    v4[0] = v1;
    std::vector<std::vector<double>> v18 = v9;
    const std::vector<double> v38 = v18[0];
    const std::vector<double> v14 = v9[1];
    const std::vector<double> v31 = v18[1];
    const std::vector<std::vector<double>> v20 = v0.p1;
    std::vector<std::vector<double>> v42 = v4;
    const s0 v60(v42, v20);
    v4[2] = v1;
    v18[1] = v14;
    v4[0] = v38;
    v42[0] = v31;
    return v60;
  }
  s2 f61(const s2 &v0) {
    const s5 v30(v0, v0);
    s5 v69 = v30;
    s5 v76 = v69;
    v69.p1 = v0;
    const s2 v214 = v76.p0;
    return v214;
  }
  std::vector<std::vector<double>> f46(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v3 = v0;
    std::vector<std::vector<double>> v6 = v3;
    const std::vector<std::vector<std::vector<double>>> v7 { v6, v6, v6, v0 };
    const std::vector<std::vector<double>> v8 = v7[0];
    std::vector<std::vector<std::vector<double>>> v2 = v7;
    const std::vector<double> v5 = v6[0];
    const std::vector<double> v4 = v6[0];
    std::vector<double> v11 = v5;
    const std::vector<std::vector<std::vector<std::vector<double>>>> v14 { v7, v7, v7, v2 };
    const std::vector<std::vector<std::vector<double>>> v10 = v14[1];
    v3[1] = v11;
    v6[1] = v4;
    const std::vector<std::vector<double>> v21 = v10[0];
    v3[1] = v4;
    v2[1] = v8;
    v6[1] = v5;
    return v21;
  }
  s2 f45(const s2 &v0) {
    s2 v6 = v0;
    const s0 v5 = v0.p1;
    s2 v3 = v0;
    s0 v4 = v5;
    s2 v1 = v6;
    const s2 v10 = f61(v3);
    v1.p1 = v4;
    v3.p1 = v5;
    const s0 v11 = f63(v5);
    v1.p1 = v11;
    const s1 v9 = v10.p0;
    const std::vector<std::vector<double>> v14 = v5.p1;
    s0 v20 = v4;
    const std::vector<std::vector<double>> v18 = f46(v14);
    const std::vector<s0> v23 = v9.p0;
    const std::vector<std::vector<double>> v21 = f46(v18);
    v3.p0 = v9;
    const s0 v22 = v23[0];
    v1.p0 = v9;
    const std::vector<std::vector<double>> v67 = v22.p0;
    v6.p1 = v20;
    v4.p0 = v67;
    const s2 v69 = f61(v1);
    v1.p1 = v20;
    v1.p0 = v9;
    v4.p1 = v21;
    return v69;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    s2 v4 = v0;
    const s2 v5 = f45(v4);
    const s0 v7 = v4.p1;
    s0 v10 = v7;
    v4.p1 = v10;
    const s2 v11 = f61(v5);
    const s0 v21 = f63(v10);
    double v30 = v1;
    const std::vector<std::vector<double>> v56 = v21.p1;
    const std::vector<double> v46 = v56[0];
    const double v31 = v46[0];
    const double v34 = v46[0];
    const double v53 = v34 + v30;
    const double v60 = v31 + v53;
    const s1 v99 = v11.p0;
    double v55 = v60;
    v4.p0 = v99;
    return v55;
  }
  int main() {
    s2 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } });
    double v1(15.0);
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
