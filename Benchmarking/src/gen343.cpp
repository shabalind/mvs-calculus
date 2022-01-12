  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f50(const double &v0) {
    double v1 = v0;
    double v5 = v0;
    double v6 = v1;
    double v8 = v6;
    double v11 = v8;
    double v12 = v5;
    v5 = v11;
    const std::vector<double> v17 { v11, v12 };
    std::vector<double> v20 = v17;
    const std::vector<std::vector<double>> v22 { v20, v17, v20 };
    const std::vector<double> v51 = v22[0];
    v20[0] = v12;
    const double v26 = v51[1];
    return v26;
  }
  double f47(const double &v0) {
    const double v1 = f50(v0);
    const double v2 = f50(v1);
    const double v4 = f50(v1);
    double v9 = v1;
    double v7 = v0;
    const double v8 = f50(v4);
    const double v5 = f50(v4);
    const double v6 = f50(v5);
    double v10 = v0;
    const double v15 = f50(v6);
    const double v20 = v2 / v2;
    const double v19 = f50(v9);
    const double v25 = f50(v8);
    const std::vector<double> v23 { v7, v20, v25 };
    std::vector<double> v29 = v23;
    std::vector<double> v40 = v29;
    std::vector<double> v28 = v40;
    v29[1] = v2;
    const double v46 = f50(v19);
    std::vector<double> v26 = v28;
    const double v39 = v26[2];
    double v32 = v39;
    const double v41 = f50(v10);
    v29 = v28;
    v40[1] = v46;
    v40 = v23;
    v40[0] = v41;
    v28[1] = v15;
    return v32;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<double> v7 = v3[0];
    const double v9 = v7[0];
    std::vector<double> v12 = v7;
    const std::vector<std::vector<double>> v11 = v0.p0;
    const double v16 = v1 / v9;
    const std::vector<double> v19 = v11[0];
    const double v21 = v12[0];
    const double v52 = v19[0];
    const double v59 = f47(v9);
    const double v53 = v12[0];
    double v142 = v16;
    double v39 = v142;
    const double v31 = f50(v21);
    v12[0] = v31;
    double v180 = v53;
    v12[0] = v39;
    const double v97 = v12[0];
    double v297 = v180;
    double v192 = v16;
    const std::vector<double> v102 { v59, v52, v53, v142, v97, v297, v192 };
    const double v194 = v102[4];
    return v194;
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
