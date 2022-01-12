  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f88(const s0 &v0) {
    s0 v2 = v0;
    v2 = v0;
    s0 v7 = v0;
    s0 v4 = v2;
    const std::vector<std::vector<double>> v6 = v7.p0;
    const std::vector<double> v3 = v6[1];
    v7 = v4;
    std::vector<std::vector<double>> v8 = v6;
    v8[0] = v3;
    const std::vector<double> v5 = v8[0];
    std::vector<double> v16 = v5;
    const std::vector<double> v14 = v8[1];
    const double v12 = v16[0];
    const std::vector<std::vector<double>> v10 = v4.p1;
    v16[0] = v12;
    v4 = v2;
    const double v13 = v14[0];
    const std::vector<std::vector<double>> v49 = v4.p0;
    const std::vector<double> v20 = v6[0];
    const std::vector<std::vector<double>> v19 = v7.p1;
    v4.p1 = v19;
    std::vector<std::vector<double>> v21 = v49;
    const std::vector<s0> v36 { v0 };
    v8[0] = v14;
    v21 = v6;
    double v59 = v13;
    s0 v34 = v4;
    v16[0] = v59;
    const std::vector<std::vector<double>> v105 = v34.p0;
    s0 v61 = v7;
    const std::vector<std::vector<double>> v64 = v61.p0;
    v8[0] = v20;
    const s0 v56(v64, v10);
    v7 = v56;
    v21[0] = v5;
    v34.p0 = v21;
    v8[0] = v16;
    v34.p0 = v105;
    v2.p0 = v8;
    std::vector<s0> v77 = v36;
    const s0 v74 = v77[0];
    v61 = v74;
    return v34;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v4 = f88(v0);
    const std::vector<std::vector<double>> v2 = v4.p0;
    double v14 = v1;
    const std::vector<double> v17 = v2[0];
    const double v23 = v17[0];
    const double v22 = v14 - v14;
    const double v28 = v22 * v23;
    return v28;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
    double v1(3.0);
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
