  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<s0>> p1;
    std::vector<std::vector<s0>> p2;
    std::vector<s1> p3;
    std::vector<std::vector<s0>> p4;
    s3(std::vector<std::vector<double>> v0, std::vector<std::vector<s0>> v1, std::vector<std::vector<s0>> v2, std::vector<s1> v3, std::vector<std::vector<s0>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  double f117(const double &v0) {
    double v4 = v0;
    double v6 = v0;
    double v5 = v4;
    const double v8 = v4 * v5;
    const double v2 = v0 / v8;
    double v1 = v4;
    v6 = v1;
    double v23 = v4;
    const std::vector<double> v14 { v6, v4, v1, v4, v6 };
    double v18 = v23;
    std::vector<double> v25 = v14;
    const double v21 = v14[4];
    std::vector<double> v13 = v14;
    double v20 = v18;
    v13[4] = v1;
    v25[4] = v8;
    v13[1] = v21;
    v13[4] = v2;
    v13[2] = v2;
    std::vector<double> v32 = v13;
    double v35 = v0;
    v5 = v1;
    const double v90 = v14[3];
    double v39 = v20;
    v32[3] = v18;
    double v57 = v2;
    v32[1] = v8;
    v25[0] = v1;
    v1 = v39;
    double v45 = v90;
    const double v49 = v32[0];
    v13[1] = v57;
    std::vector<double> v44 = v25;
    std::vector<double> v75 = v44;
    v45 = v1;
    v5 = v23;
    v13[4] = v45;
    v75[3] = v23;
    const std::vector<std::vector<double>> v109 { v25 };
    const double v97 = v75[3];
    const double v79 = v14[3];
    std::vector<std::vector<double>> v58 = v109;
    const std::vector<double> v148 = v58[0];
    v13[3] = v49;
    v58[0] = v14;
    v44[2] = v79;
    v13 = v148;
    v75[3] = v35;
    v75[3] = v20;
    v57 = v21;
    v44[0] = v49;
    return v97;
  }
  double f104(const double &v0) {
    const double v1 = f117(v0);
    double v6 = v0;
    const double v5 = f117(v6);
    const double v3 = f117(v1);
    const double v8 = f117(v5);
    double v2 = v8;
    const double v4 = f117(v2);
    const double v10 = f117(v0);
    const double v20 = f117(v10);
    double v7 = v3;
    const std::vector<double> v13 { v8, v7, v1, v3 };
    const double v9 = f117(v20);
    std::vector<double> v24 = v13;
    const double v45 = v24[1];
    std::vector<double> v28 = v24;
    v28[2] = v9;
    v24[2] = v45;
    const double v12 = f117(v10);
    double v22 = v3;
    std::vector<double> v62 = v13;
    v24[2] = v22;
    const double v27 = f117(v4);
    v62 = v28;
    v28[2] = v8;
    v62[1] = v45;
    const double v56 = v62[2];
    double v30 = v56;
    v30 = v12;
    v62[1] = v22;
    v24[2] = v27;
    return v30;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const double &v1) {
    double v4 = v1;
    const double v32 = f104(v4);
    const double v31 = f117(v32);
    return v31;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { 0.0 }, { 1.0 } }, { { { { 2.0 }, { { 3.0 } } } }, { { { 4.0 }, { { 5.0 } } } }, { { { 6.0 }, { { 7.0 } } } } }, { { { { 8.0 }, { { 9.0 } } } } }, { { { { { { 10.0 }, { { 11.0 } } } }, { { { 12.0 }, { { 13.0 } } } }, { { { 14.0 }, { { 15.0 } } } } }, { { 16.0 }, { { 17.0 } } } } }, { { { { 18.0 }, { { 19.0 } } } }, { { { 20.0 }, { { 21.0 } } } } } } }, { { { { 22.0 }, { 23.0 } }, { { { { 24.0 }, { { 25.0 } } } }, { { { 26.0 }, { { 27.0 } } } }, { { { 28.0 }, { { 29.0 } } } } }, { { { { 30.0 }, { { 31.0 } } } } }, { { { { { { 32.0 }, { { 33.0 } } } }, { { { 34.0 }, { { 35.0 } } } }, { { { 36.0 }, { { 37.0 } } } } }, { { 38.0 }, { { 39.0 } } } } }, { { { { 40.0 }, { { 41.0 } } } }, { { { 42.0 }, { { 43.0 } } } } } } }, { { { { 44.0 }, { 45.0 } }, { { { { 46.0 }, { { 47.0 } } } }, { { { 48.0 }, { { 49.0 } } } }, { { { 50.0 }, { { 51.0 } } } } }, { { { { 52.0 }, { { 53.0 } } } } }, { { { { { { 54.0 }, { { 55.0 } } } }, { { { 56.0 }, { { 57.0 } } } }, { { { 58.0 }, { { 59.0 } } } } }, { { 60.0 }, { { 61.0 } } } } }, { { { { 62.0 }, { { 63.0 } } } }, { { { 64.0 }, { { 65.0 } } } } } } } });
    double v1(66.0);
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
