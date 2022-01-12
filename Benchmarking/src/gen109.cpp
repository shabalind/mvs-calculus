  #include <vector>
  #include <iostream>
  #include <chrono>
  double f81(const double &v0) {
    double v3 = v0;
    double v1 = v3;
    double v5 = v3;
    const double v2 = v1 + v3;
    double v8 = v0;
    double v7 = v8;
    double v6 = v5;
    double v12 = v6;
    double v11 = v12;
    const std::vector<double> v18 { v7, v0, v11, v5, v3, v7 };
    const double v20 = v18[2];
    std::vector<double> v39 = v18;
    v39[5] = v20;
    v39[0] = v11;
    v39[3] = v2;
    const double v40 = v39[5];
    return v40;
  }
  std::vector<double> f44(const std::vector<double> &v0, const std::vector<double> &v1) {
    const double v3 = v0[0];
    const double v9 = f81(v3);
    double v13 = v9;
    std::vector<double> v14 = v0;
    const double v28 = v14[0];
    std::vector<double> v10 = v0;
    v10[0] = v28;
    v10[0] = v13;
    const double v32 = v14[0];
    std::vector<double> v26 = v10;
    std::vector<double> v56 = v26;
    const double v132 = v14[0];
    std::vector<double> v68 = v56;
    v10[0] = v32;
    std::vector<double> v145 = v68;
    v26[0] = v132;
    std::vector<double> v157 = v10;
    v10 = v157;
    return v145;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    double v6 = v3;
    const std::vector<double> v4 = v1[0];
    std::vector<double> v13 = v4;
    const std::vector<double> v10 = f44(v4, v4);
    const double v9 = v13[0];
    v13[0] = v9;
    const double v21 = v6 * v9;
    v13[0] = v6;
    const double v34 = v10[0];
    const double v36 = v21 + v34;
    return v36;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 }, { 2.0 }, { 3.0 } });
    std::vector<std::vector<double>> v2({ { 4.0 }, { 5.0 } });
    double v3(6.0);
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
