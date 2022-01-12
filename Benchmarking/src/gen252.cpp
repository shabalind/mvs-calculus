  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const double &v0) {
    double v6 = v0;
    double v3 = v0;
    v6 = v3;
    double v1 = v0;
    v3 = v0;
    double v7 = v3;
    const std::vector<double> v4 { v1, v3, v3, v6 };
    v3 = v7;
    const double v5 = v4[2];
    const double v8 = v4[3];
    const double v17 = v4[3];
    const double v11 = v4[3];
    const double v15 = v4[2];
    const double v13 = v4[0];
    double v12 = v15;
    const double v14 = v4[0];
    std::vector<double> v38 = v4;
    const double v22 = v4[3];
    const std::vector<std::vector<double>> v31 { v38, v4, v38, v38, v38, v4 };
    v38[0] = v14;
    v38[1] = v7;
    std::vector<double> v19 = v38;
    std::vector<std::vector<double>> v34 = v31;
    const std::vector<double> v28 = v34[1];
    const std::vector<double> v39 = v31[1];
    const std::vector<double> v35 = v34[1];
    std::vector<std::vector<double>> v68 = v34;
    const std::vector<double> v26 = v68[0];
    const double v84 = v19[3];
    v34[1] = v35;
    const double v47 = v28[0];
    const std::vector<double> v30 = v31[5];
    const double v33 = v26[0];
    const double v60 = v35[3];
    const double v101 = v35[2];
    v1 = v60;
    double v77 = v17;
    v38[1] = v84;
    v34[4] = v30;
    const std::vector<double> v41 { v7, v12, v1, v77, v22, v13, v11 };
    const double v75 = v26[0];
    std::vector<double> v71 = v41;
    std::vector<double> v138 = v71;
    v138[4] = v5;
    const double v108 = v41[6];
    double v162 = v33;
    v34[5] = v39;
    v34[0] = v28;
    std::vector<double> v63 = v138;
    const double v131 = v63[0];
    v71[1] = v108;
    v63[4] = v101;
    v138 = v63;
    v19[2] = v47;
    v71[4] = v75;
    v162 = v14;
    v19[0] = v8;
    v19[1] = v162;
    return v131;
  }
  int main() {
    double v0(0.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
