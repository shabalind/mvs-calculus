  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s4(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s0 p0;
    s4 p1;
    s8(s0 v0, s4 v1): p0(v0), p1(v1) { }
  };
  s8 f19(const s0 &v0, const s8 &v1) {
    s8 v6 = v1;
    return v6;
  }
  __attribute__((noinline))
  double f0(const s8 &v0, const double &v1) {
    s8 v5 = v0;
    const s0 v3 = v5.p0;
    const s8 v6 = f19(v3, v5);
    v5.p0 = v3;
    v5 = v0;
    v5.p0 = v3;
    const s0 v4 = v6.p0;
    s0 v13 = v4;
    const std::vector<std::vector<double>> v11 = v3.p1;
    const s4 v9 = v0.p1;
    v13.p1 = v11;
    std::vector<std::vector<double>> v2 = v11;
    const std::vector<double> v7 = v2[0];
    const s8 v20 = f19(v13, v6);
    std::vector<double> v8 = v7;
    const std::vector<std::vector<double>> v24 = v3.p0;
    v8 = v7;
    v5.p0 = v3;
    const s8 v23 = f19(v3, v20);
    const std::vector<std::vector<double>> v36 = v4.p1;
    const double v26 = v7[0];
    v2[0] = v7;
    const double v22 = v26 / v26;
    const s0 v35(v24, v2);
    const std::vector<std::vector<double>> v48 = v13.p0;
    std::vector<double> v30 = v8;
    v2[0] = v7;
    const std::vector<std::vector<double>> v56 = v35.p0;
    const std::vector<double> v37 = v56[1];
    v2[0] = v37;
    v8[0] = v26;
    v8[0] = v22;
    const double v33 = v8[0];
    v30[0] = v26;
    v13 = v35;
    v5.p1 = v9;
    const s0 v109 = v23.p0;
    v5.p0 = v109;
    v2[0] = v30;
    v30 = v8;
    v13.p1 = v36;
    const s0 v92(v48, v36);
    v13.p0 = v56;
    v5.p0 = v92;
    v5.p1 = v9;
    return v33;
  }
  int main() {
    s8 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } } });
    double v1(16.0);
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
