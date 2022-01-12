  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<double> f29(const std::vector<double> &v0) {
    std::vector<double> v3 = v0;
    const double v1 = v3[2];
    const double v7 = v0[0];
    std::vector<double> v4 = v0;
    std::vector<double> v6 = v3;
    double v5 = v7;
    const double v15 = v4[0];
    const double v14 = v6[2];
    std::vector<double> v9 = v3;
    const double v12 = v6[2];
    v9[0] = v5;
    std::vector<double> v11 = v0;
    const std::vector<double> v10 { v1, v15, v14, v14, v15, v15, v1 };
    v9[1] = v12;
    v11[1] = v14;
    std::vector<double> v13 = v10;
    v9 = v3;
    const double v23 = v13[1];
    std::vector<double> v19 = v9;
    const double v22 = v9[0];
    const double v60 = v0[2];
    const double v62 = v22 + v1;
    v19[0] = v22;
    std::vector<double> v86 = v19;
    v86 = v11;
    v3[0] = v60;
    v19[0] = v23;
    v5 = v15;
    v6[2] = v62;
    return v86;
  }
  std::vector<double> f22(const std::vector<double> &v0) {
    const double v6 = v0[2];
    std::vector<double> v2 = v0;
    v2[2] = v6;
    const double v4 = v2[0];
    const double v5 = v0[1];
    const std::vector<double> v1 = f29(v2);
    v2[0] = v5;
    const std::vector<double> v9 = f29(v2);
    const double v25 = v4 / v4;
    const std::vector<std::vector<double>> v19 { v0, v1, v9 };
    const std::vector<double> v24 = v19[2];
    std::vector<double> v29 = v24;
    v29[0] = v25;
    return v29;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<double> &v1, const double &v2) {
    const double v13 = v1[0];
    const std::vector<double> v11 = f22(v1);
    std::vector<double> v10 = v1;
    v10 = v11;
    v10[2] = v13;
    const double v18 = v11[0];
    v10[1] = v13;
    const double v33 = v10[0];
    double v23 = v33;
    std::vector<double> v26 = v11;
    v26[0] = v23;
    std::vector<double> v61 = v26;
    v10[2] = v18;
    const double v32 = v61[2];
    return v32;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<double> v1({ 3.0, 4.0, 5.0 });
    double v2(6.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
