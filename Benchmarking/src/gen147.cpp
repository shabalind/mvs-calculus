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
  struct s2 {
    s1 p0;
    s1 p1;
    s1 p2;
    s2(s1 v0, s1 v1, s1 v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f46(const s0 &v0) {
    s0 v3 = v0;
    s0 v2 = v3;
    const std::vector<std::vector<double>> v11 = v0.p1;
    s0 v6 = v2;
    const std::vector<std::vector<double>> v5 = v3.p1;
    const std::vector<std::vector<double>> v10 = v3.p1;
    v3.p1 = v11;
    const std::vector<std::vector<double>> v15 = v6.p1;
    const std::vector<std::vector<double>> v9 = v0.p0;
    const std::vector<std::vector<double>> v27 = v0.p0;
    v3.p0 = v27;
    const std::vector<double> v28 = v9[0];
    v2.p0 = v9;
    const std::vector<std::vector<double>> v12 = v6.p0;
    v3.p1 = v15;
    v6.p0 = v9;
    std::vector<std::vector<double>> v16 = v12;
    v6.p1 = v15;
    const std::vector<double> v20 = v16[0];
    v16[0] = v28;
    const std::vector<std::vector<double>> v34 = v2.p1;
    v16[0] = v20;
    const std::vector<std::vector<double>> v19 = v3.p0;
    v6.p1 = v5;
    const s0 v21(v19, v10);
    v2.p0 = v16;
    v6.p1 = v34;
    v6 = v2;
    v3.p0 = v16;
    return v21;
  }
  s0 f30(const s0 &v0) {
    const s1 v1(v0, v0);
    const s0 v5 = f46(v0);
    s1 v6 = v1;
    const s0 v3 = f46(v0);
    s1 v7 = v6;
    v7.p1 = v5;
    s1 v4 = v6;
    s1 v2 = v6;
    const s0 v15 = v7.p1;
    v2 = v4;
    const s0 v21 = v2.p0;
    v6.p1 = v15;
    v6 = v2;
    v7.p0 = v21;
    const s0 v63 = v6.p0;
    const s0 v18 = f46(v63);
    const s2 v40(v2, v4, v1);
    v2.p1 = v18;
    const s1 v39 = v40.p0;
    const s0 v214 = v6.p1;
    v6.p1 = v214;
    v6.p0 = v214;
    v4.p0 = v3;
    const s0 v122 = v39.p1;
    return v122;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v6 = v0[1];
    const s0 v4 = f30(v6);
    const std::vector<std::vector<double>> v5 = v4.p0;
    const std::vector<double> v23 = v5[0];
    const double v54 = v23[0];
    double v27 = v54;
    const double v55 = v54 + v27;
    return v55;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } });
    double v1(6.0);
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
