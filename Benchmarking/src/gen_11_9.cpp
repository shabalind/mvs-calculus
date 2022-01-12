  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    s0(std::vector<double> v0): p0(v0) { }
  };
  struct s2 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s2(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  s2 f84(const s2 &v0) {
    const std::vector<std::vector<s0>> v1 = v0.p1;
    std::vector<std::vector<s0>> v3 = v1;
    const s0 v4 = v0.p0;
    const std::vector<s0> v6 = v3[0];
    s2 v2 = v0;
    v3[1] = v6;
    std::vector<s0> v5 = v6;
    const s0 v9 = v0.p0;
    v2.p0 = v4;
    const std::vector<std::vector<s0>> v16 = v2.p1;
    v2.p0 = v4;
    v3[1] = v5;
    v2.p1 = v3;
    v3[0] = v6;
    v5[0] = v9;
    v5[0] = v4;
    const s2 v13(v4, v16);
    v5[0] = v9;
    return v13;
  }
  s0 f75(const s0 &v0, const s0 &v1) {
    s0 v6 = v0;
    s0 v3 = v6;
    v3 = v1;
    const std::vector<double> v4 = v0.p0;
    const std::vector<double> v9 = v6.p0;
    s0 v13 = v3;
    const std::vector<double> v11 = v1.p0;
    const s0 v19(v4);
    v13.p0 = v11;
    std::vector<double> v24 = v4;
    v13 = v1;
    v6 = v3;
    const std::vector<double> v18 = v13.p0;
    std::vector<double> v12 = v24;
    std::vector<double> v26 = v9;
    std::vector<double> v31 = v12;
    v3.p0 = v24;
    const std::vector<double> v34 = v19.p0;
    const std::vector<std::vector<double>> v22 { v26, v4, v31, v34, v18, v11 };
    const std::vector<double> v29 = v22[4];
    v24 = v29;
    return v13;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v7 = v0[0];
    const s2 v2 = f84(v7);
    const s2 v8 = f84(v2);
    const s0 v18 = v8.p0;
    const s0 v19 = f75(v18, v18);
    const s0 v23 = f75(v19, v19);
    const std::vector<double> v69 = v23.p0;
    const double v100 = v69[1];
    return v100;
  }
  int main() {
    std::vector<s2> v0({ { { { 0.0, 1.0 } }, { { { { 2.0, 3.0 } } }, { { { 4.0, 5.0 } } } } }, { { { 6.0, 7.0 } }, { { { { 8.0, 9.0 } } }, { { { 10.0, 11.0 } } } } } });
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
