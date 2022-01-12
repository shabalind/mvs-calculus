  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    double p0;
    s1 p1;
    s1 p2;
    s0 p3;
    s2(double v0, s1 v1, s1 v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s5(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f120(const double &v0) {
    double v3 = v0;
    double v7 = v3;
    double v4 = v7;
    v4 = v3;
    double v1 = v0;
    double v6 = v0;
    double v9 = v3;
    double v24 = v3;
    double v8 = v24;
    double v12 = v8;
    double v11 = v3;
    const std::vector<double> v25 { v24, v11, v1 };
    double v18 = v9;
    std::vector<double> v29 = v25;
    std::vector<double> v48 = v25;
    const double v14 = v48[0];
    v48[1] = v18;
    const double v43 = v24 / v14;
    v9 = v0;
    double v22 = v0;
    const std::vector<double> v37 { v22, v24, v6, v24, v43 };
    v29[0] = v9;
    const double v16 = v29[2];
    double v39 = v16;
    v29[0] = v3;
    const double v33 = v37[0];
    std::vector<double> v53 = v37;
    std::vector<double> v70 = v53;
    std::vector<double> v41 = v53;
    const double v57 = v37[4];
    double v42 = v4;
    v41[3] = v39;
    double v67 = v1;
    std::vector<double> v77 = v37;
    const std::vector<std::vector<double>> v49 { v70, v70, v77, v41 };
    v53[2] = v12;
    std::vector<std::vector<double>> v55 = v49;
    v53[3] = v42;
    std::vector<std::vector<double>> v79 = v55;
    std::vector<std::vector<double>> v92 = v79;
    v53[0] = v42;
    const std::vector<double> v102 = v92[3];
    v41[2] = v67;
    std::vector<double> v58 = v102;
    const double v130 = v58[3];
    v7 = v57;
    const double v256 = v33 + v130;
    return v256;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const std::vector<s3> &v1, const std::vector<std::vector<s0>> &v2, const s5 &v3, const double &v4) {
    const double v6 = f120(v4);
    double v11 = v6;
    const double v16 = f120(v6);
    const double v24 = f120(v11);
    const double v43 = v6 / v11;
    v11 = v4;
    v11 = v43;
    const double v70 = v24 * v16;
    return v70;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } }, { { 10.0 } }, { { 11.0 }, { 12.0 } } } }, { { { { 13.0 }, { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 } }, { { 23.0 } }, { { 24.0 }, { 25.0 } } } } });
    std::vector<s3> v1({ { { 26.0, { { { { { 27.0 }, { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 } }, { { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } }, { { 50.0 } }, { { 51.0 }, { 52.0 } } } }, { { { { { 53.0 }, { 54.0 }, { 55.0 } }, { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 }, { 60.0 } }, { { 61.0 }, { 62.0 } }, { { 63.0 } }, { { 64.0 }, { 65.0 } } } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } }, { { 76.0 } }, { { 77.0 }, { 78.0 } } } }, { { { 79.0 }, { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 }, { 84.0 } }, { { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 } }, { { 89.0 } }, { { 90.0 }, { 91.0 } } } }, { 92.0, { { { { { 93.0 }, { 94.0 }, { 95.0 } }, { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 } }, { { 101.0 }, { 102.0 } }, { { 103.0 } }, { { 104.0 }, { 105.0 } } } }, { { { 106.0 }, { 107.0 }, { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } }, { { 112.0 }, { 113.0 } }, { { 114.0 }, { 115.0 } }, { { 116.0 } }, { { 117.0 }, { 118.0 } } } }, { { { { { 119.0 }, { 120.0 }, { 121.0 } }, { { 122.0 }, { 123.0 }, { 124.0 } }, { { 125.0 }, { 126.0 } }, { { 127.0 }, { 128.0 } }, { { 129.0 } }, { { 130.0 }, { 131.0 } } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } }, { { 140.0 }, { 141.0 } }, { { 142.0 } }, { { 143.0 }, { 144.0 } } } }, { { { 145.0 }, { 146.0 }, { 147.0 } }, { { 148.0 }, { 149.0 }, { 150.0 } }, { { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 } }, { { 155.0 } }, { { 156.0 }, { 157.0 } } } } } });
    std::vector<std::vector<s0>> v2({ { { { { 158.0 }, { 159.0 }, { 160.0 } }, { { 161.0 }, { 162.0 }, { 163.0 } }, { { 164.0 }, { 165.0 } }, { { 166.0 }, { 167.0 } }, { { 168.0 } }, { { 169.0 }, { 170.0 } } } }, { { { { 171.0 }, { 172.0 }, { 173.0 } }, { { 174.0 }, { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 } }, { { 179.0 }, { 180.0 } }, { { 181.0 } }, { { 182.0 }, { 183.0 } } } }, { { { { 184.0 }, { 185.0 }, { 186.0 } }, { { 187.0 }, { 188.0 }, { 189.0 } }, { { 190.0 }, { 191.0 } }, { { 192.0 }, { 193.0 } }, { { 194.0 } }, { { 195.0 }, { 196.0 } } } } });
    s5 v3({ { { { { { 197.0 }, { 198.0 }, { 199.0 } }, { { 200.0 }, { 201.0 }, { 202.0 } }, { { 203.0 }, { 204.0 } }, { { 205.0 }, { 206.0 } }, { { 207.0 } }, { { 208.0 }, { 209.0 } } } } }, { { { { 210.0 }, { 211.0 }, { 212.0 } }, { { 213.0 }, { 214.0 }, { 215.0 } }, { { 216.0 }, { 217.0 } }, { { 218.0 }, { 219.0 } }, { { 220.0 } }, { { 221.0 }, { 222.0 } } }, { { { 223.0 }, { 224.0 }, { 225.0 } }, { { 226.0 }, { 227.0 }, { 228.0 } }, { { 229.0 }, { 230.0 } }, { { 231.0 }, { 232.0 } }, { { 233.0 } }, { { 234.0 }, { 235.0 } } }, { { { 236.0 }, { 237.0 }, { 238.0 } }, { { 239.0 }, { 240.0 }, { 241.0 } }, { { 242.0 }, { 243.0 } }, { { 244.0 }, { 245.0 } }, { { 246.0 } }, { { 247.0 }, { 248.0 } } } } });
    double v4(249.0);
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
