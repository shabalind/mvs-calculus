  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    s1 p1;
    s5(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s1 f120(const s1 &v0) {
    const std::vector<s1> v7 { v0, v0, v0, v0, v0, v0 };
    const s1 v5 = v7[4];
    const s1 v1 = v7[0];
    const s0 v13 = v5.p1;
    const s1 v33(v13, v13);
    const s5 v38(v33, v1);
    const s1 v71 = v38.p0;
    return v71;
  }
  s1 f46(const s1 &v0) {
    s1 v7 = v0;
    s1 v4 = v7;
    const s1 v3 = f120(v4);
    s1 v1 = v3;
    return v1;
  }
  std::vector<std::vector<s1>> f25(const std::vector<std::vector<s1>> &v0) {
    std::vector<std::vector<s1>> v3 = v0;
    const std::vector<s1> v6 = v0[0];
    v3 = v0;
    std::vector<s1> v2 = v6;
    const s1 v4 = v6[0];
    v3[0] = v2;
    const s0 v7 = v4.p0;
    const s1 v9(v7, v7);
    const std::vector<s1> v1 = v3[0];
    const s1 v13 = f46(v9);
    v2[0] = v13;
    v2[0] = v4;
    v3[0] = v1;
    std::vector<std::vector<s1>> v20 = v0;
    v20[1] = v1;
    v2[0] = v4;
    return v20;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<std::vector<s1>> v3 = f25(v0);
    const std::vector<s1> v5 = v3[0];
    const s1 v12 = v5[0];
    const s0 v20 = v12.p0;
    const std::vector<std::vector<double>> v29 = v20.p0;
    const std::vector<std::vector<double>> v31 = v20.p1;
    const std::vector<double> v27 = v31[0];
    const double v47 = v27[0];
    const std::vector<double> v62 = v29[0];
    std::vector<std::vector<double>> v55 = v31;
    const double v78 = v1 / v47;
    const std::vector<double> v149 = v55[1];
    const double v46 = v149[0];
    v55 = v31;
    v55[1] = v62;
    double v102 = v46;
    const double v83 = v102 + v102;
    const double v93 = v78 - v83;
    return v93;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } });
    double v1(12.0);
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
