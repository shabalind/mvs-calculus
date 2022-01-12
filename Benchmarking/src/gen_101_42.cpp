  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const double &v1) {
    double v3 = v1;
    double v7 = v3;
    double v2 = v1;
    std::vector<double> v4 = v0;
    std::vector<double> v9 = v0;
    v9[0] = v2;
    const double v6 = v9[0];
    v4[0] = v6;
    double v5 = v7;
    v9[0] = v3;
    std::vector<double> v11 = v9;
    double v8 = v5;
    std::vector<double> v14 = v0;
    v4[0] = v1;
    std::vector<double> v20 = v4;
    const double v10 = v20[0];
    v14 = v9;
    v7 = v5;
    const double v13 = v4[0];
    const double v34 = v0[0];
    double v15 = v3;
    const double v17 = v11[0];
    v9[0] = v2;
    std::vector<double> v18 = v4;
    const double v12 = v14[0];
    v14[0] = v1;
    const double v31 = v13 + v17;
    const double v23 = v0[0];
    v11[0] = v8;
    double v24 = v31;
    v11[0] = v3;
    v18[0] = v34;
    v14[0] = v23;
    const double v32 = v18[0];
    v18[0] = v8;
    v4[0] = v15;
    v9[0] = v34;
    double v124 = v8;
    v14[0] = v24;
    const std::vector<double> v58 { v31, v124, v10 };
    v124 = v12;
    const double v56 = v11[0];
    std::vector<double> v44 = v58;
    v8 = v32;
    v44[0] = v5;
    std::vector<double> v59 = v44;
    v15 = v56;
    const double v106 = v59[2];
    return v106;
  }
  int main() {
    std::vector<double> v0({ 0.0 });
    double v1(1.0);
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
