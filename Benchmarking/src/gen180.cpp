  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f29(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<std::vector<double>>> v6 { v1, v1, v1, v1 };
    std::vector<std::vector<std::vector<double>>> v7 = v6;
    const std::vector<std::vector<double>> v17 = v6[2];
    v7[0] = v17;
    const std::vector<std::vector<double>> v33 = v7[1];
    v7 = v6;
    std::vector<std::vector<std::vector<double>>> v82 = v7;
    v7[1] = v17;
    v7 = v82;
    return v33;
  }
  std::vector<std::vector<double>> f26(const std::vector<std::vector<double>> &v0) {
    return v0;
  }
  std::vector<std::vector<double>> f17(const std::vector<std::vector<double>> &v0) {
    const std::vector<std::vector<double>> v4 = f26(v0);
    const std::vector<std::vector<double>> v13 = f26(v4);
    const std::vector<std::vector<double>> v1 = f26(v4);
    std::vector<std::vector<double>> v18 = v1;
    v18 = v13;
    const std::vector<std::vector<double>> v54 = f26(v18);
    return v54;
  }
  std::vector<std::vector<double>> f15(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<double>> v5 = f17(v1);
    const std::vector<std::vector<double>> v28 = f26(v5);
    const std::vector<std::vector<double>> v60 = f17(v28);
    return v60;
  }
  std::vector<std::vector<double>> f10(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<double> v7 = v0[1];
    std::vector<std::vector<double>> v3 = v0;
    std::vector<double> v6 = v7;
    const double v2 = v7[0];
    v6[0] = v2;
    const std::vector<std::vector<double>> v13 = f15(v0, v3);
    const std::vector<double> v5 = v13[1];
    std::vector<double> v16 = v5;
    const std::vector<std::vector<double>> v54 { v6, v16 };
    std::vector<std::vector<double>> v26 = v54;
    const std::vector<std::vector<double>> v37 = f29(v26, v1);
    const std::vector<double> v46 = v1[1];
    v26[1] = v46;
    return v37;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const double &v1) {
    const std::vector<std::vector<double>> v3 = f26(v0);
    const std::vector<std::vector<double>> v4 = f10(v0, v3);
    const std::vector<double> v5 = v4[2];
    std::vector<double> v7 = v5;
    const std::vector<double> v2 = v3[0];
    v7[0] = v1;
    v7[0] = v1;
    v7[0] = v1;
    v7[0] = v1;
    v7[0] = v1;
    v7[0] = v1;
    const double v10 = v1 / v1;
    double v15 = v1;
    const double v11 = v2[0];
    v7[0] = v11;
    v15 = v11;
    v7[0] = v10;
    const double v29 = v7[0];
    const double v16 = v29 * v15;
    const std::vector<double> v43 { v1, v16, v10 };
    v7[0] = v16;
    v7[0] = v11;
    const double v37 = v43[2];
    v7[0] = v29;
    return v37;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
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
