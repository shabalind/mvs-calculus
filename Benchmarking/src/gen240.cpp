  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1, const std::vector<double> &v2, const double &v3) {
    std::vector<double> v6 = v2;
    v6[0] = v3;
    v6[1] = v3;
    const double v5 = v2[1];
    v6[0] = v3;
    std::vector<double> v7 = v6;
    const std::vector<double> v13 = v1[2];
    v7[0] = v3;
    const double v4 = v5 / v5;
    v6[0] = v4;
    const std::vector<double> v14 = v0[0];
    std::vector<double> v39 = v13;
    const double v21 = v39[0];
    double v26 = v3;
    double v19 = v21;
    const double v33 = v2[0];
    v39[0] = v26;
    double v24 = v33;
    v39[0] = v5;
    std::vector<double> v44 = v39;
    v7[0] = v19;
    std::vector<double> v31 = v2;
    const double v59 = v2[1];
    v44 = v39;
    v39[0] = v24;
    double v42 = v59;
    const double v77 = v21 / v21;
    std::vector<double> v65 = v7;
    const std::vector<std::vector<double>> v100 { v65, v31, v7, v6, v7, v7 };
    const std::vector<double> v120 = v100[5];
    v44[0] = v5;
    const double v78 = v120[0];
    v65[2] = v77;
    v7[0] = v24;
    std::vector<double> v119 = v2;
    const double v143 = v119[2];
    const double v79 = v14[0];
    v119[0] = v79;
    const double v103 = v44[0];
    v31[2] = v143;
    std::vector<double> v301 = v7;
    v44[0] = v26;
    v65[2] = v103;
    v7 = v301;
    double v177 = v78;
    v301[2] = v42;
    return v177;
  }
  int main() {
    std::vector<std::vector<double>> v0({ { 0.0 } });
    std::vector<std::vector<double>> v1({ { 1.0 }, { 2.0 }, { 3.0 } });
    std::vector<double> v2({ 4.0, 5.0, 6.0 });
    double v3(7.0);
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
