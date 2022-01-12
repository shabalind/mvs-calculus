  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f21(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v5 = v7.p2;
    v7.p0 = v5;
    std::vector<std::vector<double>> v4 = v5;
    const std::vector<double> v8 = v4[1];
    v4[0] = v8;
    v7.p2 = v4;
    const double v3 = v8[0];
    const std::vector<std::vector<double>> v9 = v7.p0;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<double> v2 { v3 };
    double v6 = v3;
    const std::vector<std::vector<double>> v10 = v7.p0;
    v7.p0 = v4;
    const double v13 = v2[0];
    v7 = v0;
    const std::vector<std::vector<double>> v11 = v0.p2;
    std::vector<double> v12 = v2;
    const std::vector<std::vector<double>> v18 = v7.p1;
    const std::vector<std::vector<double>> v20 = v0.p1;
    v4[1] = v2;
    double v25 = v13;
    const std::vector<double> v19 = v18[0];
    const s0 v14(v10, v1, v10);
    v4[1] = v12;
    double v17 = v6;
    v4[1] = v19;
    const std::vector<std::vector<double>> v16 = v14.p2;
    v7.p2 = v9;
    v4[0] = v19;
    v12[0] = v17;
    v7.p0 = v11;
    const std::vector<std::vector<double>> v45 = v14.p1;
    s0 v39 = v14;
    const std::vector<std::vector<double>> v32 = v0.p1;
    const std::vector<std::vector<double>> v47 = v39.p0;
    v12[0] = v25;
    v39.p1 = v18;
    v39.p0 = v16;
    const s0 v54(v4, v45, v47);
    v4[1] = v2;
    const double v51 = v8[0];
    v7.p1 = v32;
    v39.p0 = v5;
    v39.p1 = v20;
    v12[0] = v51;
    return v54;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v5 = f21(v0);
    const std::vector<std::vector<double>> v8 = v5.p0;
    const std::vector<double> v3 = v8[0];
    const double v31 = v3[0];
    double v139 = v31;
    return v139;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 }, { 5.0 }, { 6.0 } } });
    double v1(7.0);
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
