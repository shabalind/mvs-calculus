  #include <vector>
  #include <iostream>
  #include <chrono>
  double f45(const double &v0) {
    double v8 = v0;
    double v5 = v8;
    double v2 = v0;
    double v12 = v5;
    double v9 = v12;
    double v7 = v9;
    const std::vector<double> v38 { v7, v2 };
    std::vector<double> v31 = v38;
    const double v34 = v31[0];
    return v34;
  }
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1, const double &v2) {
    const double v7 = v0[1];
    const double v6 = f45(v1);
    std::vector<double> v8 = v0;
    v8[1] = v6;
    const double v4 = f45(v7);
    v8 = v0;
    std::vector<double> v10 = v0;
    double v5 = v2;
    v8[2] = v2;
    const double v3 = v0[1];
    v10[1] = v3;
    const double v16 = v10[2];
    std::vector<double> v12 = v10;
    v10[1] = v7;
    const double v22 = v0[0];
    const double v23 = v0[2];
    v8[0] = v16;
    const double v21 = f45(v4);
    const double v41 = f45(v23);
    v12[0] = v23;
    const double v36 = f45(v22);
    const double v31 = f45(v41);
    v8[0] = v21;
    v8[2] = v4;
    std::vector<double> v43 = v12;
    const double v28 = v10[0];
    double v19 = v31;
    const double v95 = f45(v5);
    const double v60 = f45(v36);
    const double v27 = f45(v41);
    v10[0] = v19;
    double v83 = v28;
    std::vector<double> v105 = v8;
    const double v44 = v105[1];
    const double v58 = f45(v60);
    v105[0] = v83;
    v105 = v43;
    const double v141 = f45(v58);
    v10[1] = v27;
    v12[0] = v141;
    v12[0] = v4;
    v8[0] = v95;
    const double v176 = f45(v44);
    return v176;
  }
  int main() {
    std::vector<double> v0({ 0.0, 1.0, 2.0 });
    double v1(3.0);
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
