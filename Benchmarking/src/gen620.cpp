  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s2 p1;
    s3(std::vector<s1> v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f22(const double &v0) {
    const double v6 = v0 + v0;
    double v5 = v6;
    double v1 = v0;
    v1 = v5;
    double v3 = v1;
    double v8 = v6;
    double v11 = v8;
    double v12 = v5;
    double v4 = v8;
    v3 = v4;
    double v17 = v12;
    double v14 = v3;
    double v2 = v11;
    double v15 = v14;
    double v10 = v14;
    const std::vector<double> v27 { v15, v10, v17 };
    const std::vector<std::vector<double>> v30 { v27, v27, v27, v27, v27, v27 };
    const double v20 = v11 + v17;
    v14 = v2;
    const std::vector<double> v46 = v30[0];
    const std::vector<double> v23 = v30[0];
    const double v16 = v5 + v4;
    std::vector<double> v24 = v46;
    std::vector<double> v13 = v46;
    v13[1] = v20;
    v24[1] = v20;
    std::vector<std::vector<double>> v34 = v30;
    v13[2] = v14;
    v13[0] = v8;
    v13[1] = v1;
    std::vector<double> v41 = v27;
    const std::vector<double> v60 = v34[1];
    const std::vector<double> v32 = v30[4];
    v15 = v3;
    std::vector<double> v53 = v13;
    v13[2] = v3;
    std::vector<double> v56 = v32;
    std::vector<double> v35 = v60;
    v24[2] = v3;
    v35[2] = v16;
    v24[1] = v1;
    v34[4] = v56;
    const double v96 = v35[0];
    std::vector<double> v52 = v53;
    const double v65 = v52[1];
    const double v117 = v41[1];
    v41[0] = v20;
    v52[1] = v117;
    const std::vector<double> v105 { v8, v96, v1, v20, v96, v65 };
    std::vector<double> v115 = v105;
    v41[1] = v96;
    const double v148 = v115[5];
    v52[1] = v4;
    const double v79 = v24[0];
    v34[0] = v23;
    v35[2] = v79;
    double v94 = v148;
    return v94;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<std::vector<s2>> &v1, const double &v2) {
    const double v16 = v2 / v2;
    const std::vector<double> v19 { v16, v16, v16, v16, v16, v2, v2 };
    const double v36 = f22(v2);
    const double v77 = v19[2];
    const double v60 = f22(v77);
    const double v123 = f22(v60);
    const double v232 = v123 * v36;
    return v232;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } } } }, { { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } } });
    std::vector<std::vector<s2>> v1({ { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } } } }, { { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } }, { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } } } });
    double v2(56.0);
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
