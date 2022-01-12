  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f57(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v2 = v0[0];
    std::vector<std::vector<double>> v1 = v0;
    const std::vector<std::vector<std::vector<double>>> v4 { v0, v1 };
    std::vector<std::vector<double>> v5 = v0;
    v5[0] = v2;
    v1[0] = v2;
    std::vector<std::vector<double>> v15 = v5;
    const std::vector<double> v12 = v15[0];
    std::vector<std::vector<std::vector<double>>> v28 = v4;
    v15[0] = v12;
    std::vector<std::vector<std::vector<double>>> v23 = v28;
    v23[0] = v15;
    v15 = v5;
    v28[1] = v1;
    const std::vector<std::vector<double>> v157 = v23[0];
    return v157;
  }
  std::vector<std::vector<double>> f56(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const std::vector<std::vector<double>> &v3) {
    const std::vector<std::vector<double>> v5 = f57(v2);
    std::vector<std::vector<double>> v15 = v5;
    std::vector<std::vector<double>> v9 = v15;
    return v9;
  }
  std::vector<double> f54(const std::vector<double> &v0) {
    const double v6 = v0[0];
    const double v8 = v0[0];
    double v4 = v6;
    std::vector<double> v3 = v0;
    v3[0] = v4;
    v3 = v0;
    v3[0] = v8;
    return v3;
  }
  std::vector<std::vector<double>> f29(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v6 = f56(v0, v0, v0, v0);
    const std::vector<std::vector<double>> v2 = f57(v6);
    return v2;
  }
  std::vector<std::vector<double>> f13(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v6 = f56(v0, v0, v0, v0);
    std::vector<std::vector<double>> v5 = v6;
    std::vector<std::vector<double>> v9 = v5;
    const std::vector<std::vector<double>> v104 = f56(v6, v5, v0, v9);
    const std::vector<std::vector<double>> v55 = f29(v104);
    return v55;
  }
  std::vector<std::vector<double>> f12(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v5 = v0;
    const std::vector<double> v6 = v5[0];
    const std::vector<std::vector<double>> v2 = f13(v5);
    const std::vector<double> v1 = v5[0];
    const double v7 = v1[0];
    std::vector<double> v4 = v6;
    v5[0] = v6;
    const std::vector<std::vector<double>> v13 = f56(v2, v0, v5, v0);
    v4[0] = v7;
    const std::vector<double> v10 = v2[0];
    v5[0] = v10;
    const std::vector<std::vector<double>> v15 = f56(v0, v5, v0, v13);
    v5[0] = v4;
    const std::vector<std::vector<double>> v18 = f57(v15);
    return v18;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<double> &v1, const double &v2) {
    const std::vector<std::vector<double>> v11 = f12(v0);
    const std::vector<double> v10 = v11[0];
    const std::vector<std::vector<double>> v18 { v1, v1, v1 };
    const std::vector<double> v14 = f54(v10);
    std::vector<std::vector<double>> v20 = v18;
    const std::vector<double> v46 = v20[2];
    const double v30 = v46[1];
    std::vector<double> v22 = v14;
    const double v60 = v22[0];
    const std::vector<std::vector<double>> v32 { v46, v46 };
    std::vector<double> v16 = v46;
    v20[0] = v46;
    v16[1] = v60;
    std::vector<std::vector<double>> v92 = v32;
    std::vector<double> v63 = v46;
    std::vector<std::vector<double>> v54 = v92;
    v20[1] = v16;
    v92[1] = v46;
    const std::vector<double> v53 = v54[0];
    const double v98 = v53[0];
    v63[2] = v30;
    v54[1] = v63;
    return v98;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<double> v1({ 1.0, 2.0, 3.0 });
    double v2(4.0);
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
