  #include <vector>
  #include <iostream>
  #include <chrono>
  double f2(const double &v0) {
    double v4 = v0;
    double v6 = v4;
    double v3 = v6;
    double v5 = v4;
    double v7 = v3;
    double v1 = v5;
    double v12 = v7;
    const double v17 = v6 / v4;
    double v21 = v1;
    double v8 = v12;
    const std::vector<double> v18 { v3, v12, v21 };
    const std::vector<std::vector<double>> v56 { v18, v18, v18 };
    std::vector<std::vector<double>> v24 = v56;
    const std::vector<double> v31 { v3, v5, v8, v5 };
    v24[0] = v18;
    const std::vector<double> v73 = v24[2];
    const std::vector<double> v33 = v24[0];
    std::vector<std::vector<double>> v37 = v24;
    double v50 = v7;
    v37[0] = v18;
    std::vector<std::vector<double>> v32 = v37;
    std::vector<std::vector<double>> v59 = v32;
    v24[2] = v33;
    std::vector<double> v55 = v73;
    v59[2] = v33;
    v32[1] = v18;
    v24[0] = v73;
    const double v36 = v55[0];
    std::vector<double> v41 = v18;
    std::vector<double> v48 = v18;
    std::vector<std::vector<double>> v83 = v59;
    v37[2] = v33;
    v48[0] = v36;
    v83[1] = v48;
    std::vector<double> v53 = v31;
    v41[0] = v50;
    v55[1] = v17;
    const double v51 = v53[3];
    v55[0] = v51;
    const std::vector<double> v172 = v59[0];
    v24[0] = v33;
    const std::vector<double> v64 = v83[1];
    std::vector<std::vector<double>> v86 = v56;
    v59[2] = v41;
    v55 = v172;
    const double v85 = v64[2];
    const std::vector<double> v82 = v86[2];
    v83[0] = v82;
    v83[0] = v82;
    return v85;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<std::vector<double>> &v2, const double &v3) {
    const double v5 = v3 * v3;
    const double v20 = f2(v5);
    const double v17 = f2(v5);
    double v52 = v17;
    const double v28 = v52 * v5;
    v52 = v20;
    const double v150 = f2(v28);
    return v150;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 }, { 1.0 }, { 2.0 } });
    std::vector<std::vector<double>> v1({ { 3.0 }, { 4.0 }, { 5.0 } });
    std::vector<std::vector<double>> v2({ { 6.0 }, { 7.0 } });
    double v3(8.0);
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
