  #include <vector>
  #include <iostream>
  #include <chrono>
  std::vector<std::vector<double>> f6(const std::vector<std::vector<double>> &v0) {
    const std::vector<double> v16 = v0[1];
    std::vector<std::vector<double>> v12 = v0;
    std::vector<double> v29 = v16;
    std::vector<std::vector<double>> v51 = v12;
    v12[1] = v29;
    return v51;
  }
  std::vector<std::vector<double>> f3(const std::vector<std::vector<double>> &v0, const std::vector<std::vector<double>> &v1) {
    const std::vector<std::vector<double>> v8 = f6(v0);
    const std::vector<double> v4 = v8[1];
    std::vector<std::vector<double>> v7 = v0;
    const std::vector<std::vector<double>> v6 = f6(v0);
    std::vector<double> v9 = v4;
    const std::vector<std::vector<double>> v12 = f6(v7);
    const std::vector<std::vector<std::vector<double>>> v17 { v8, v8, v1, v6, v12, v8 };
    const double v18 = v9[0];
    v9[0] = v18;
    v7[1] = v9;
    const std::vector<std::vector<double>> v29 = v17[5];
    return v29;
  }
  __attribute__((noinline))
  double f0(const double &v0, const std::vector<std::vector<double>> &v1) {
    std::vector<std::vector<double>> v2 = v1;
    const std::vector<std::vector<double>> v7 = f6(v2);
    const std::vector<double> v6 { v0, v0, v0 };
    const std::vector<double> v3 = v7[0];
    v2[1] = v3;
    v2[1] = v3;
    const std::vector<std::vector<double>> v5 = f6(v7);
    const std::vector<std::vector<double>> v9 = f3(v2, v1);
    v2 = v1;
    const std::vector<std::vector<double>> v18 { v3, v3, v3, v3, v3, v3 };
    const std::vector<std::vector<double>> v8 = f3(v7, v9);
    const std::vector<std::vector<double>> v19 = f3(v7, v1);
    const std::vector<std::vector<double>> v25 = f3(v1, v19);
    v2[2] = v3;
    v2 = v7;
    const std::vector<std::vector<double>> v29 = f3(v8, v5);
    std::vector<double> v41 = v6;
    const std::vector<std::vector<double>> v36 = f6(v5);
    std::vector<double> v58 = v3;
    std::vector<std::vector<double>> v15 = v18;
    const std::vector<double> v35 = v29[1];
    std::vector<double> v24 = v58;
    const std::vector<std::vector<double>> v27 = f3(v36, v5);
    std::vector<std::vector<double>> v37 = v15;
    v15[5] = v24;
    v2 = v25;
    const std::vector<double> v47 = v37[3];
    const std::vector<double> v39 = v27[2];
    v15 = v37;
    const double v88 = v47[0];
    v2[0] = v24;
    v37[4] = v35;
    const double v59 = v41[0];
    v24[0] = v59;
    v37[5] = v39;
    v37[2] = v24;
    return v88;
  }
  int main() {
    double v0(0.0);
    std::vector<std::vector<double>> v1({ { 1.0 }, { 2.0 }, { 3.0 } });
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
