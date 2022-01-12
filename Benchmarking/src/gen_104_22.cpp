  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  double f2(const double &v0) {
    double v1 = v0;
    double v9 = v1;
    double v8 = v1;
    double v2 = v0;
    double v5 = v2;
    const double v19 = v1 * v9;
    double v11 = v5;
    double v32 = v19;
    double v25 = v5;
    const double v20 = v25 - v25;
    const std::vector<double> v31 { v9 };
    std::vector<double> v43 = v31;
    v43[0] = v20;
    v43[0] = v32;
    v43[0] = v5;
    v43[0] = v8;
    v43[0] = v11;
    std::vector<double> v39 = v43;
    const double v38 = v39[0];
    v43[0] = v20;
    double v42 = v38;
    v43[0] = v5;
    v39[0] = v25;
    v39[0] = v25;
    return v42;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v3 = v0.p2;
    const std::vector<double> v5 = v3[1];
    const double v6 = v1 + v1;
    const double v2 = f2(v6);
    const std::vector<std::vector<double>> v9 = v0.p2;
    std::vector<double> v7 = v5;
    v7[0] = v1;
    std::vector<double> v11 = v5;
    v11[0] = v1;
    v7[0] = v2;
    const double v20 = f2(v2);
    const std::vector<double> v17 = v9[0];
    v11[0] = v20;
    const double v47 = f2(v6);
    const double v18 = v11[0];
    const double v30 = f2(v6);
    const double v26 = f2(v30);
    const double v52 = v17[0];
    double v40 = v47;
    v7[0] = v52;
    const double v15 = v40 * v26;
    const double v35 = f2(v18);
    const double v94 = f2(v30);
    const double v48 = f2(v18);
    v11[0] = v35;
    v11 = v7;
    v7[0] = v15;
    v11[0] = v94;
    return v48;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 } } });
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
