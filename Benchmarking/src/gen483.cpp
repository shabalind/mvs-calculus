  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s2 p2;
    s1 p3;
    s3(s1 v0, std::vector<s0> v1, s2 v2, s1 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  double f73(const double &v0) {
    double v6 = v0;
    double v1 = v6;
    double v4 = v1;
    double v2 = v1;
    double v5 = v1;
    double v10 = v6;
    double v8 = v2;
    double v11 = v1;
    double v27 = v4;
    double v14 = v1;
    const std::vector<double> v12 { v4 };
    std::vector<double> v18 = v12;
    std::vector<double> v46 = v18;
    std::vector<double> v21 = v18;
    std::vector<double> v25 = v21;
    std::vector<double> v32 = v46;
    std::vector<double> v40 = v18;
    double v23 = v2;
    double v37 = v5;
    const std::vector<std::vector<double>> v83 { v18, v40, v21, v25, v40, v21, v40 };
    v18[0] = v37;
    const std::vector<double> v39 = v83[0];
    std::vector<double> v70 = v40;
    v32 = v39;
    v70 = v46;
    double v45 = v2;
    v40[0] = v14;
    v18[0] = v6;
    const std::vector<double> v78 = v83[6];
    v2 = v10;
    v70[0] = v11;
    v32[0] = v23;
    v70[0] = v45;
    const double v138 = v70[0];
    v40[0] = v138;
    const std::vector<std::vector<double>> v92 { v78, v32 };
    v18[0] = v11;
    std::vector<std::vector<double>> v84 = v92;
    v46[0] = v27;
    const std::vector<double> v96 = v84[0];
    const double v130 = v96[0];
    v46[0] = v8;
    return v130;
  }
  double f10(const double &v0) {
    double v6 = v0;
    const double v3 = f73(v0);
    double v1 = v6;
    double v9 = v6;
    double v12 = v3;
    const double v10 = f73(v9);
    const double v4 = f73(v10);
    const double v20 = f73(v4);
    const std::vector<double> v22 { v4, v3, v20, v1, v9 };
    std::vector<double> v26 = v22;
    std::vector<double> v18 = v26;
    v18[1] = v12;
    v26[3] = v3;
    v18 = v26;
    const double v44 = v18[1];
    double v125 = v44;
    return v125;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v4 = v0[2];
    const double v2 = f10(v1);
    const s2 v7 = v4.p2;
    const double v16 = f10(v1);
    const double v20 = f10(v2);
    const double v37 = v20 + v16;
    const s0 v24 = v7.p0;
    const double v82 = f10(v37);
    const std::vector<std::vector<double>> v39 = v24.p2;
    const std::vector<double> v75 = v39[1];
    std::vector<double> v92 = v75;
    v92[0] = v82;
    const double v78 = v92[0];
    return v78;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } }, { { 6.0 } } }, { { { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 } }, { { 13.0 } } } }, { { { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } }, { { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 } }, { { 34.0 } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 } }, { { 41.0 } } } }, { { { { 42.0 }, { 43.0 } }, { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } }, { { 48.0 } } }, { { { { { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } }, { { 55.0 } } }, { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } }, { { 60.0 }, { 61.0 } }, { { 62.0 } } } }, { { { 63.0 }, { 64.0 } }, { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 } }, { { 69.0 } } } } }, { { { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } }, { { 76.0 } } }, { { { 77.0 }, { 78.0 } }, { { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 } }, { { 83.0 } } } }, { { { 84.0 }, { 85.0 } }, { { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } }, { { 90.0 } } } } }, { { { { { { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } }, { { 95.0 }, { 96.0 } }, { { 97.0 } } }, { { { 98.0 }, { 99.0 } }, { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 } }, { { 104.0 } } } }, { { { 105.0 }, { 106.0 } }, { { 107.0 }, { 108.0 } }, { { 109.0 }, { 110.0 } }, { { 111.0 } } } }, { { { { 112.0 }, { 113.0 } }, { { 114.0 }, { 115.0 } }, { { 116.0 }, { 117.0 } }, { { 118.0 } } }, { { { 119.0 }, { 120.0 } }, { { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 } }, { { 125.0 } } }, { { { 126.0 }, { 127.0 } }, { { 128.0 }, { 129.0 } }, { { 130.0 }, { 131.0 } }, { { 132.0 } } } }, { { { { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 } }, { { 137.0 }, { 138.0 } }, { { 139.0 } } }, { { { { { 140.0 }, { 141.0 } }, { { 142.0 }, { 143.0 } }, { { 144.0 }, { 145.0 } }, { { 146.0 } } }, { { { 147.0 }, { 148.0 } }, { { 149.0 }, { 150.0 } }, { { 151.0 }, { 152.0 } }, { { 153.0 } } } }, { { { 154.0 }, { 155.0 } }, { { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } }, { { 160.0 } } } } }, { { { { { 161.0 }, { 162.0 } }, { { 163.0 }, { 164.0 } }, { { 165.0 }, { 166.0 } }, { { 167.0 } } }, { { { 168.0 }, { 169.0 } }, { { 170.0 }, { 171.0 } }, { { 172.0 }, { 173.0 } }, { { 174.0 } } } }, { { { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 } }, { { 179.0 }, { 180.0 } }, { { 181.0 } } } } }, { { { { { { 182.0 }, { 183.0 } }, { { 184.0 }, { 185.0 } }, { { 186.0 }, { 187.0 } }, { { 188.0 } } }, { { { 189.0 }, { 190.0 } }, { { 191.0 }, { 192.0 } }, { { 193.0 }, { 194.0 } }, { { 195.0 } } } }, { { { 196.0 }, { 197.0 } }, { { 198.0 }, { 199.0 } }, { { 200.0 }, { 201.0 } }, { { 202.0 } } } }, { { { { 203.0 }, { 204.0 } }, { { 205.0 }, { 206.0 } }, { { 207.0 }, { 208.0 } }, { { 209.0 } } }, { { { 210.0 }, { 211.0 } }, { { 212.0 }, { 213.0 } }, { { 214.0 }, { 215.0 } }, { { 216.0 } } }, { { { 217.0 }, { 218.0 } }, { { 219.0 }, { 220.0 } }, { { 221.0 }, { 222.0 } }, { { 223.0 } } } }, { { { { 224.0 }, { 225.0 } }, { { 226.0 }, { 227.0 } }, { { 228.0 }, { 229.0 } }, { { 230.0 } } }, { { { { { 231.0 }, { 232.0 } }, { { 233.0 }, { 234.0 } }, { { 235.0 }, { 236.0 } }, { { 237.0 } } }, { { { 238.0 }, { 239.0 } }, { { 240.0 }, { 241.0 } }, { { 242.0 }, { 243.0 } }, { { 244.0 } } } }, { { { 245.0 }, { 246.0 } }, { { 247.0 }, { 248.0 } }, { { 249.0 }, { 250.0 } }, { { 251.0 } } } } }, { { { { { 252.0 }, { 253.0 } }, { { 254.0 }, { 255.0 } }, { { 256.0 }, { 257.0 } }, { { 258.0 } } }, { { { 259.0 }, { 260.0 } }, { { 261.0 }, { 262.0 } }, { { 263.0 }, { 264.0 } }, { { 265.0 } } } }, { { { 266.0 }, { 267.0 } }, { { 268.0 }, { 269.0 } }, { { 270.0 }, { 271.0 } }, { { 272.0 } } } } } });
    double v1(273.0);
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
