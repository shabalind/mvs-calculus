  #include <vector>
  #include <iostream>
  #include <chrono>
  __attribute__((noinline))
  double f0(const double &v0) {
    double v5 = v0;
    double v1 = v5;
    double v7 = v1;
    double v13 = v7;
    double v2 = v13;
    double v9 = v5;
    double v11 = v0;
    double v12 = v1;
    double v14 = v9;
    double v20 = v1;
    double v18 = v9;
    double v32 = v12;
    double v15 = v20;
    double v24 = v20;
    double v21 = v24;
    double v29 = v7;
    double v39 = v21;
    const std::vector<double> v26 { v21, v15, v29, v18, v14, v11, v39 };
    const double v31 = v26[1];
    std::vector<double> v22 = v26;
    const double v57 = v22[6];
    std::vector<double> v46 = v26;
    double v36 = v2;
    v46[5] = v57;
    v1 = v57;
    v18 = v31;
    const double v55 = v46[4];
    const std::vector<double> v97 { v36, v55 };
    std::vector<double> v80 = v97;
    std::vector<double> v79 = v80;
    v24 = v32;
    std::vector<double> v64 = v79;
    const double v76 = v22[0];
    const double v66 = v64[0];
    v5 = v76;
    return v66;
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
