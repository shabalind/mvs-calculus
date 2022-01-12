  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f8(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v4 = v0[0];
    const double v2 = v4[0];
    std::vector<std::vector<double>> v6 = v0;
    double v3 = v2;
    std::vector<std::vector<double>> v5 = v6;
    std::vector<std::vector<double>> v1 = v5;
    v1[0] = v4;
    v6[0] = v4;
    std::vector<std::vector<double>> v11 = v1;
    v3 = v2;
    v6[0] = v4;
    v11[0] = v4;
    const std::vector<double> v21 { v3, v3, v2 };
    v11 = v6;
    std::vector<std::vector<double>> v14 = v0;
    v6 = v14;
    v5 = v11;
    const std::vector<double> v29 = v14[0];
    std::vector<std::vector<double>> v34 = v11;
    const double v51 = v21[0];
    const std::vector<std::vector<std::vector<double>>> v39 { v11, v6, v0, v1, v11, v0, v34 };
    std::vector<double> v48 = v29;
    v5[0] = v48;
    std::vector<std::vector<std::vector<double>>> v73 = v39;
    const std::vector<std::vector<double>> v98 = v73[4];
    v48[0] = v51;
    return v98;
  }
  std::vector<std::vector<double>> f6(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<double>> v4 = f8(v0);
    const std::vector<std::vector<double>> v12 = f8(v4);
    return v12;
  }
  std::vector<std::vector<double>> f3(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<double>> v15 = f8(v1);
    const std::vector<std::vector<double>> v31 = f8(v15);
    return v31;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    const std::vector<std::vector<double>> v3 = f8(v1);
    const std::vector<std::vector<double>> v6 = f3(v3, v3);
    const std::vector<double> v11 = v6[0];
    const std::vector<double> v7 = v6[0];
    std::vector<std::vector<double>> v4 = v1;
    v4[0] = v11;
    v4[0] = v7;
    std::vector<std::vector<double>> v30 = v4;
    const std::vector<double> v23 = v6[0];
    v30[0] = v7;
    std::vector<std::vector<double>> v17 = v4;
    const std::vector<double> v18 = v0[0];
    std::vector<double> v13 = v18;
    const std::vector<std::vector<double>> v52 = f3(v3, v17);
    v4[0] = v13;
    v17[0] = v23;
    v30[0] = v13;
    v30[0] = v23;
    const std::vector<std::vector<double>> v78 = f6(v52, v30);
    const std::vector<double> v66 = v78[0];
    const double v64 = v66[0];
    return v64;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 } });
    std::vector<std::vector<double>> v1({ { 2.0 } });
    double v2(3.0);
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
