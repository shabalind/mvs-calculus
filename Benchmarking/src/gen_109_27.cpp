  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s2 p1;
    s3(std::vector<s0> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    std::vector<std::vector<s3>> p1;
    s4(s2 v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    s0 p1;
    s5(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s5 p0;
    s4 p1;
    std::vector<s3> p2;
    s9(s5 v0, s4 v1, std::vector<s3> v2): p0(v0), p1(v1), p2(v2) { }
  };
  double f53(const double &v0) {
    double v1 = v0;
    double v4 = v1;
    double v2 = v0;
    v2 = v0;
    double v6 = v2;
    double v7 = v6;
    double v12 = v0;
    double v5 = v12;
    double v3 = v12;
    double v8 = v0;
    v3 = v5;
    double v14 = v5;
    double v19 = v12;
    double v13 = v6;
    double v17 = v4;
    const double v15 = v13 / v19;
    double v24 = v13;
    v17 = v3;
    const std::vector<double> v18 { v17, v7, v6, v13, v13 };
    std::vector<double> v28 = v18;
    std::vector<double> v27 = v18;
    v28[4] = v0;
    std::vector<double> v31 = v27;
    v28[4] = v14;
    std::vector<double> v74 = v18;
    const double v69 = v28[2];
    std::vector<double> v32 = v28;
    const double v21 = v28[4];
    v32[2] = v13;
    v31[1] = v13;
    v74[4] = v8;
    std::vector<double> v43 = v31;
    v31[3] = v69;
    double v42 = v24;
    v74[2] = v19;
    v42 = v24;
    std::vector<double> v40 = v43;
    double v49 = v3;
    v43[0] = v1;
    const std::vector<std::vector<double>> v59 { v40, v32, v40, v32, v32 };
    std::vector<std::vector<double>> v65 = v59;
    v32[1] = v42;
    v43[3] = v4;
    v65[0] = v74;
    v28[3] = v15;
    v40[4] = v14;
    v4 = v49;
    const std::vector<std::vector<std::vector<double>>> v104 { v65, v59, v59 };
    std::vector<std::vector<std::vector<double>>> v86 = v104;
    v32[0] = v21;
    const std::vector<std::vector<double>> v57 = v86[2];
    const std::vector<double> v63 = v57[0];
    v65[4] = v43;
    const double v53 = v63[0];
    return v53;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const s9 &v1, const double &v2) {
    const double v5 = f53(v2);
    const double v13 = v5 * v5;
    const double v74 = f53(v13);
    return v74;
  }
  int main() {
    s4 v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } } } }, { { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } }, { { { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } }, { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } }, { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } } } } } });
    s9 v1({ { { { { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } } }, { { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } } }, { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } }, { { { { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } } }, { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } } }, { { { { { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } }, { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } } }, { { { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } }, { { { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } } } } } }, { { { { { { 112.0 } }, { { 113.0 }, { 114.0 }, { 115.0 } } }, { { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 } }, { { 121.0 }, { 122.0 }, { 123.0 } } } }, { { { { { 124.0 } }, { { 125.0 }, { 126.0 }, { 127.0 } } } }, { { { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } } } } }, { { { { { { 132.0 } }, { { 133.0 }, { 134.0 }, { 135.0 } } }, { { { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } }, { { { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } } }, { { { { { 144.0 } }, { { 145.0 }, { 146.0 }, { 147.0 } } } }, { { { 148.0 } }, { { 149.0 }, { 150.0 }, { 151.0 } } } } } } } }, { { { { { { 152.0 } }, { { 153.0 }, { 154.0 }, { 155.0 } } }, { { { 156.0 } }, { { 157.0 }, { 158.0 }, { 159.0 } } }, { { { 160.0 } }, { { 161.0 }, { 162.0 }, { 163.0 } } } }, { { { { { 164.0 } }, { { 165.0 }, { 166.0 }, { 167.0 } } } }, { { { 168.0 } }, { { 169.0 }, { 170.0 }, { 171.0 } } } } }, { { { { { 172.0 } }, { { 173.0 }, { 174.0 }, { 175.0 } } }, { { { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } } }, { { { 180.0 } }, { { 181.0 }, { 182.0 }, { 183.0 } } } }, { { { { { 184.0 } }, { { 185.0 }, { 186.0 }, { 187.0 } } } }, { { { 188.0 } }, { { 189.0 }, { 190.0 }, { 191.0 } } } } }, { { { { { 192.0 } }, { { 193.0 }, { 194.0 }, { 195.0 } } }, { { { 196.0 } }, { { 197.0 }, { 198.0 }, { 199.0 } } }, { { { 200.0 } }, { { 201.0 }, { 202.0 }, { 203.0 } } } }, { { { { { 204.0 } }, { { 205.0 }, { 206.0 }, { 207.0 } } } }, { { { 208.0 } }, { { 209.0 }, { 210.0 }, { 211.0 } } } } } } });
    double v2(212.0);
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
