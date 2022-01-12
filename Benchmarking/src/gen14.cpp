  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<s1> p1;
    s3(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    std::vector<std::vector<double>> p1;
    s4(s3 v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f28(const double &v0) {
    double v4 = v0;
    double v2 = v0;
    double v13 = v0;
    double v7 = v4;
    double v1 = v7;
    double v3 = v7;
    double v5 = v3;
    const std::vector<double> v9 { v7, v4, v13, v5, v5, v13, v13 };
    v4 = v3;
    std::vector<double> v6 = v9;
    std::vector<double> v19 = v6;
    double v26 = v0;
    std::vector<double> v21 = v9;
    std::vector<double> v14 = v6;
    double v17 = v0;
    std::vector<double> v22 = v19;
    const double v33 = v22[6];
    std::vector<double> v25 = v9;
    v19[4] = v26;
    const double v16 = v9[0];
    double v37 = v0;
    v21[4] = v37;
    v14[6] = v17;
    v19[0] = v16;
    v14[1] = v1;
    std::vector<double> v36 = v14;
    const double v34 = v9[1];
    const double v24 = v36[3];
    const double v30 = v25[1];
    std::vector<double> v27 = v19;
    std::vector<double> v46 = v22;
    std::vector<double> v47 = v36;
    double v50 = v2;
    v21[2] = v33;
    double v42 = v37;
    v22[6] = v0;
    v37 = v30;
    std::vector<double> v68 = v27;
    v27 = v21;
    const std::vector<std::vector<double>> v48 { v68, v21, v47, v9, v36, v46 };
    v27[0] = v50;
    v42 = v24;
    const std::vector<double> v35 = v48[3];
    std::vector<std::vector<double>> v69 = v48;
    const std::vector<double> v73 = v48[5];
    v5 = v42;
    const double v91 = v73[1];
    v22 = v35;
    const std::vector<double> v110 = v69[3];
    const double v120 = v110[4];
    v27[6] = v34;
    v13 = v91;
    return v120;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s4>> &v0, const double &v1) {
    double v5 = v1;
    const double v4 = f28(v1);
    double v2 = v4;
    const double v17 = v2 * v5;
    const double v43 = v17 + v17;
    const std::vector<double> v32 { v43 };
    const double v49 = f28(v2);
    const double v48 = v32[0];
    const double v79 = v49 / v48;
    return v79;
  }
  int main() {
    std::vector<std::vector<s4>> v0({ { { { { { { 0.0 } }, 1.0 }, { { { { { { { 2.0 } }, 3.0 } }, { { { { 4.0 } }, 5.0 } }, { { { { 6.0 } }, 7.0 } } }, { { { { 8.0 } }, 9.0 } } }, { { { { { { 10.0 } }, 11.0 } }, { { { { 12.0 } }, 13.0 } }, { { { { 14.0 } }, 15.0 } } }, { { { { 16.0 } }, 17.0 } } } } }, { { 18.0 }, { 19.0 }, { 20.0 } } } }, { { { { { { 21.0 } }, 22.0 }, { { { { { { { 23.0 } }, 24.0 } }, { { { { 25.0 } }, 26.0 } }, { { { { 27.0 } }, 28.0 } } }, { { { { 29.0 } }, 30.0 } } }, { { { { { { 31.0 } }, 32.0 } }, { { { { 33.0 } }, 34.0 } }, { { { { 35.0 } }, 36.0 } } }, { { { { 37.0 } }, 38.0 } } } } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } });
    double v1(42.0);
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
