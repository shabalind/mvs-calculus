  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f69(const std::vector<std::vector<double>> &v0) {
    return v0;
  }
  std::vector<std::vector<double>> f63(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v2 = f69(v0);
    const std::vector<std::vector<double>> v7 = f69(v0);
    std::vector<std::vector<double>> v4 = v0;
    const std::vector<double> v5 = v7[0];
    const std::vector<std::vector<double>> v11 = f69(v2);
    const std::vector<std::vector<double>> v20 = f69(v11);
    std::vector<double> v12 = v5;
    const std::vector<double> v24 = v2[0];
    const std::vector<std::vector<double>> v45 = f69(v4);
    const double v31 = v24[0];
    const std::vector<std::vector<double>> v25 = f69(v20);
    const std::vector<std::vector<double>> v37 = f69(v45);
    const std::vector<double> v49 = v25[0];
    const double v96 = v49[0];
    double v65 = v96;
    std::vector<double> v114 = v12;
    v12[0] = v96;
    double v93 = v31;
    const std::vector<double> v78 = v37[0];
    std::vector<double> v97 = v114;
    v114[0] = v65;
    std::vector<std::vector<double>> v100 = v7;
    std::vector<double> v95 = v78;
    v114 = v95;
    v65 = v93;
    v100[0] = v97;
    return v100;
  }
  std::vector<std::vector<double>> f39(const std::vector<double> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<std::vector<double>>> v2 { v1, v1, v1 };
    std::vector<std::vector<std::vector<double>>> v6 = v2;
    v6 = v2;
    const std::vector<std::vector<double>> v3 = v6[0];
    const std::vector<std::vector<double>> v16 = f63(v3);
    const std::vector<std::vector<double>> v32 = f63(v1);
    v6[0] = v32;
    return v16;
  }
  std::vector<std::vector<double>> f13(const std::vector<std::vector<double>> &v0) {
    std::vector<std::vector<double>> v7 = v0;
    std::vector<std::vector<double>> v8 = v0;
    const std::vector<double> v9 = v8[0];
    const std::vector<std::vector<double>> v4 { v9, v9, v9, v9, v9, v9 };
    std::vector<std::vector<double>> v11 = v4;
    const std::vector<std::vector<double>> v16 = f39(v9, v7);
    std::vector<std::vector<double>> v26 = v11;
    v7 = v0;
    std::vector<double> v10 = v9;
    const double v27 = v9[0];
    double v18 = v27;
    std::vector<double> v30 = v10;
    const std::vector<double> v25 = v4[0];
    const std::vector<double> v22 = v26[4];
    const std::vector<std::vector<double>> v24 = f63(v8);
    const std::vector<std::vector<double>> v29 = f39(v22, v16);
    v8[0] = v30;
    v11[0] = v30;
    v30[0] = v18;
    v7 = v24;
    v11[2] = v25;
    return v29;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    const std::vector<double> v4 = v2[0];
    const std::vector<std::vector<double>> v13 = f13(v2);
    const std::vector<double> v23 = v13[0];
    std::vector<double> v14 = v4;
    v14 = v23;
    v14[0] = v3;
    const double v118 = v14[0];
    double v54 = v118;
    double v90 = v54;
    v14[0] = v54;
    return v90;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v2({ { 3.0 } });
    double v3(4.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
