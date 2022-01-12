  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    double p1;
    s0 p2;
    std::vector<s1> p3;
    s2(std::vector<s0> v0, double v1, s0 v2, std::vector<s1> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s2 p1;
    s3(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<double>> p0;
    s3 p1;
    s4(std::vector<std::vector<double>> v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s3 p0;
    std::vector<s1> p1;
    s6(s3 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s0 p0;
    s6 p1;
    s7(s0 v0, s6 v1): p0(v0), p1(v1) { }
  };
  double f23(const double &v0) {
    double v4 = v0;
    double v5 = v4;
    double v6 = v5;
    double v2 = v5;
    double v10 = v2;
    const double v1 = v6 + v6;
    double v12 = v2;
    double v11 = v12;
    double v14 = v12;
    double v9 = v14;
    double v20 = v6;
    double v13 = v11;
    double v15 = v9;
    double v46 = v15;
    const std::vector<double> v23 { v46 };
    const double v30 = v23[0];
    double v60 = v20;
    double v32 = v1;
    const std::vector<double> v39 { v32, v13, v30, v11 };
    std::vector<double> v65 = v39;
    v65[1] = v11;
    v65[0] = v32;
    const double v55 = v65[2];
    v65[1] = v60;
    v65[2] = v10;
    return v55;
  }
  double f6(const double &v0) {
    double v4 = v0;
    double v7 = v4;
    const double v1 = f23(v7);
    const double v3 = f23(v1);
    const double v9 = f23(v0);
    double v10 = v9;
    double v14 = v4;
    const double v11 = f23(v14);
    const double v15 = f23(v7);
    double v22 = v1;
    double v33 = v11;
    double v12 = v33;
    double v16 = v22;
    double v30 = v10;
    double v20 = v22;
    const double v24 = f23(v3);
    const double v21 = f23(v9);
    v30 = v20;
    const double v31 = f23(v12);
    const double v44 = f23(v16);
    double v49 = v24;
    double v72 = v10;
    v7 = v31;
    const double v41 = v11 - v15;
    double v57 = v3;
    v57 = v72;
    const std::vector<double> v78 { v21, v57 };
    std::vector<double> v87 = v78;
    double v83 = v41;
    v87[0] = v83;
    v87[1] = v7;
    v22 = v49;
    std::vector<double> v76 = v87;
    std::vector<double> v130 = v76;
    v130[1] = v44;
    std::vector<double> v111 = v130;
    const double v180 = v111[0];
    v76[1] = v30;
    return v180;
  }
  __attribute__((noinline))
  double f0(const s6 &v0, const std::vector<s4> &v1, const std::vector<double> &v2, const std::vector<s7> &v3, const double &v4) {
    const double v39 = f6(v4);
    std::vector<double> v38 = v2;
    const double v26 = v38[0];
    const double v40 = f6(v39);
    v38[1] = v40;
    return v26;
  }
  int main() {
    s6 v0({ { { { { 0.0 }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 }, { { 4.0 }, { 5.0 } } } }, 6.0, { { 7.0 }, { { 8.0 }, { 9.0 } } }, { { { { 10.0 }, { { 11.0 }, { 12.0 } } }, { { 13.0 }, { { 14.0 }, { 15.0 } } } } } } }, { { { { 16.0 }, { { 17.0 }, { 18.0 } } }, { { 19.0 }, { { 20.0 }, { 21.0 } } } }, { { { 22.0 }, { { 23.0 }, { 24.0 } } }, { { 25.0 }, { { 26.0 }, { 27.0 } } } } } });
    std::vector<s4> v1({ { { { 28.0 }, { 29.0 } }, { { { { 30.0 }, { { 31.0 }, { 32.0 } } } }, { { { { 33.0 }, { { 34.0 }, { 35.0 } } } }, 36.0, { { 37.0 }, { { 38.0 }, { 39.0 } } }, { { { { 40.0 }, { { 41.0 }, { 42.0 } } }, { { 43.0 }, { { 44.0 }, { 45.0 } } } } } } } }, { { { 46.0 }, { 47.0 } }, { { { { 48.0 }, { { 49.0 }, { 50.0 } } } }, { { { { 51.0 }, { { 52.0 }, { 53.0 } } } }, 54.0, { { 55.0 }, { { 56.0 }, { 57.0 } } }, { { { { 58.0 }, { { 59.0 }, { 60.0 } } }, { { 61.0 }, { { 62.0 }, { 63.0 } } } } } } } } });
    std::vector<double> v2({ 64.0, 65.0 });
    std::vector<s7> v3({ { { { 66.0 }, { { 67.0 }, { 68.0 } } }, { { { { { 69.0 }, { { 70.0 }, { 71.0 } } } }, { { { { 72.0 }, { { 73.0 }, { 74.0 } } } }, 75.0, { { 76.0 }, { { 77.0 }, { 78.0 } } }, { { { { 79.0 }, { { 80.0 }, { 81.0 } } }, { { 82.0 }, { { 83.0 }, { 84.0 } } } } } } }, { { { { 85.0 }, { { 86.0 }, { 87.0 } } }, { { 88.0 }, { { 89.0 }, { 90.0 } } } }, { { { 91.0 }, { { 92.0 }, { 93.0 } } }, { { 94.0 }, { { 95.0 }, { 96.0 } } } } } } }, { { { 97.0 }, { { 98.0 }, { 99.0 } } }, { { { { { 100.0 }, { { 101.0 }, { 102.0 } } } }, { { { { 103.0 }, { { 104.0 }, { 105.0 } } } }, 106.0, { { 107.0 }, { { 108.0 }, { 109.0 } } }, { { { { 110.0 }, { { 111.0 }, { 112.0 } } }, { { 113.0 }, { { 114.0 }, { 115.0 } } } } } } }, { { { { 116.0 }, { { 117.0 }, { 118.0 } } }, { { 119.0 }, { { 120.0 }, { 121.0 } } } }, { { { 122.0 }, { { 123.0 }, { 124.0 } } }, { { 125.0 }, { { 126.0 }, { 127.0 } } } } } } }, { { { 128.0 }, { { 129.0 }, { 130.0 } } }, { { { { { 131.0 }, { { 132.0 }, { 133.0 } } } }, { { { { 134.0 }, { { 135.0 }, { 136.0 } } } }, 137.0, { { 138.0 }, { { 139.0 }, { 140.0 } } }, { { { { 141.0 }, { { 142.0 }, { 143.0 } } }, { { 144.0 }, { { 145.0 }, { 146.0 } } } } } } }, { { { { 147.0 }, { { 148.0 }, { 149.0 } } }, { { 150.0 }, { { 151.0 }, { 152.0 } } } }, { { { 153.0 }, { { 154.0 }, { 155.0 } } }, { { 156.0 }, { { 157.0 }, { 158.0 } } } } } } } });
    double v4(159.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
