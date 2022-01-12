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
    s0 p0;
    std::vector<double> p1;
    s1(s0 v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    std::vector<s1> p1;
    s3(std::vector<s2> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    s0 p1;
    s0 p2;
    s4(s3 v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s7 {
    s3 p0;
    std::vector<s1> p1;
    s7(s3 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s4 f43(const s4 &v0) {
    s4 v1 = v0;
    s4 v12 = v1;
    return v12;
  }
  std::vector<double> f41(const std::vector<double> &v0) {
    std::vector<double> v3 = v0;
    std::vector<double> v8 = v0;
    std::vector<double> v1 = v0;
    std::vector<double> v2 = v8;
    const double v9 = v3[0];
    const double v5 = v3[0];
    const double v7 = v2[0];
    v8 = v1;
    double v13 = v7;
    double v14 = v13;
    std::vector<double> v11 = v3;
    v8[1] = v9;
    const std::vector<double> v20 { v9, v14, v5 };
    v1[1] = v5;
    std::vector<double> v26 = v20;
    const double v16 = v26[1];
    v11[1] = v14;
    v3[1] = v16;
    v2[0] = v14;
    return v11;
  }
  s3 f37(const s3 &v0, const s3 &v1) {
    const std::vector<s2> v2 = v1.p0;
    std::vector<s2> v4 = v2;
    const s2 v10 = v4[0];
    const std::vector<s2> v3 = v1.p0;
    std::vector<s2> v8 = v3;
    const s2 v7 = v2[0];
    v8[0] = v7;
    const s2 v6 = v4[0];
    s2 v13 = v7;
    s2 v22 = v6;
    const s2 v9 = v8[0];
    s3 v11 = v1;
    const s2 v12 = v3[0];
    v4 = v2;
    const std::vector<s2> v18 = v0.p0;
    const std::vector<s1> v20 = v11.p1;
    v8[0] = v13;
    v11.p0 = v4;
    const s1 v15 = v20[2];
    const s0 v17 = v15.p0;
    const std::vector<s1> v21 = v0.p1;
    v11.p0 = v2;
    v22.p1 = v15;
    const std::vector<s0> v51 = v9.p0;
    const std::vector<double> v31 = v15.p1;
    const s0 v23 = v51[0];
    v8[0] = v10;
    const s1 v45 = v21[0];
    const s4 v35(v1, v23, v17);
    v13 = v12;
    v13.p0 = v51;
    v8[0] = v6;
    const s4 v76 = f43(v35);
    v11.p0 = v18;
    v8[0] = v6;
    s1 v105 = v45;
    v8[0] = v12;
    const std::vector<double> v102 = f41(v31);
    v13.p0 = v51;
    const s3 v131 = v76.p0;
    v105.p1 = v102;
    v13.p1 = v105;
    v8[0] = v22;
    v8[0] = v9;
    v8 = v4;
    return v131;
  }
  std::vector<s2> f5(const std::vector<s2> &v0) {
    std::vector<s2> v7 = v0;
    const s2 v6 = v7[0];
    const std::vector<s0> v4 = v6.p0;
    const std::vector<s0> v8 = v6.p0;
    s2 v9 = v6;
    s2 v11 = v9;
    v7[0] = v11;
    v11.p0 = v4;
    const s2 v3 = v0[0];
    v7[0] = v3;
    std::vector<s0> v29 = v8;
    v9.p0 = v29;
    return v7;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const std::vector<s3> &v1, const s3 &v2, const double &v3) {
    s3 v5 = v2;
    const s3 v15 = f37(v2, v5);
    const std::vector<s2> v18 = v15.p0;
    const std::vector<s2> v13 = v15.p0;
    const s2 v29 = v18[0];
    const std::vector<s2> v10 = f5(v13);
    const std::vector<s1> v19 = v0.p1;
    v5.p0 = v10;
    const std::vector<s0> v50 = v29.p0;
    const s0 v49 = v50[0];
    std::vector<s1> v23 = v19;
    v5.p1 = v23;
    const std::vector<std::vector<double>> v51 = v49.p3;
    const std::vector<double> v97 = v51[0];
    const double v265 = v97[0];
    return v265;
  }
  int main() {
    s7 v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } }, { { 24.0 }, { 25.0 }, { 26.0 } } } }, { { { { 27.0 }, { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } }, { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { 36.0, 37.0 } } } }, { { { { { 38.0 }, { 39.0 } }, { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } }, { { 44.0 }, { 45.0 }, { 46.0 } } }, { 47.0, 48.0 } }, { { { { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } }, { { 54.0 } }, { { 55.0 }, { 56.0 }, { 57.0 } } }, { 58.0, 59.0 } }, { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } }, { { 65.0 } }, { { 66.0 }, { 67.0 }, { 68.0 } } }, { 69.0, 70.0 } } } }, { { { { { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } }, { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } }, { 80.0, 81.0 } }, { { { { 82.0 }, { 83.0 } }, { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } }, { { 88.0 }, { 89.0 }, { 90.0 } } }, { 91.0, 92.0 } }, { { { { 93.0 }, { 94.0 } }, { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } }, { 102.0, 103.0 } } } });
    std::vector<s3> v1({ { { { { { { { 104.0 }, { 105.0 } }, { { 106.0 }, { 107.0 }, { 108.0 } }, { { 109.0 } }, { { 110.0 }, { 111.0 }, { 112.0 } } }, { { { 113.0 }, { 114.0 } }, { { 115.0 }, { 116.0 }, { 117.0 } }, { { 118.0 } }, { { 119.0 }, { 120.0 }, { 121.0 } } }, { { { 122.0 }, { 123.0 } }, { { 124.0 }, { 125.0 }, { 126.0 } }, { { 127.0 } }, { { 128.0 }, { 129.0 }, { 130.0 } } } }, { { { { 131.0 }, { 132.0 } }, { { 133.0 }, { 134.0 }, { 135.0 } }, { { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } }, { 140.0, 141.0 } } } }, { { { { { 142.0 }, { 143.0 } }, { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 } }, { { 148.0 }, { 149.0 }, { 150.0 } } }, { 151.0, 152.0 } }, { { { { 153.0 }, { 154.0 } }, { { 155.0 }, { 156.0 }, { 157.0 } }, { { 158.0 } }, { { 159.0 }, { 160.0 }, { 161.0 } } }, { 162.0, 163.0 } }, { { { { 164.0 }, { 165.0 } }, { { 166.0 }, { 167.0 }, { 168.0 } }, { { 169.0 } }, { { 170.0 }, { 171.0 }, { 172.0 } } }, { 173.0, 174.0 } } } } });
    s3 v2({ { { { { { { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } }, { { 180.0 } }, { { 181.0 }, { 182.0 }, { 183.0 } } }, { { { 184.0 }, { 185.0 } }, { { 186.0 }, { 187.0 }, { 188.0 } }, { { 189.0 } }, { { 190.0 }, { 191.0 }, { 192.0 } } }, { { { 193.0 }, { 194.0 } }, { { 195.0 }, { 196.0 }, { 197.0 } }, { { 198.0 } }, { { 199.0 }, { 200.0 }, { 201.0 } } } }, { { { { 202.0 }, { 203.0 } }, { { 204.0 }, { 205.0 }, { 206.0 } }, { { 207.0 } }, { { 208.0 }, { 209.0 }, { 210.0 } } }, { 211.0, 212.0 } } } }, { { { { { 213.0 }, { 214.0 } }, { { 215.0 }, { 216.0 }, { 217.0 } }, { { 218.0 } }, { { 219.0 }, { 220.0 }, { 221.0 } } }, { 222.0, 223.0 } }, { { { { 224.0 }, { 225.0 } }, { { 226.0 }, { 227.0 }, { 228.0 } }, { { 229.0 } }, { { 230.0 }, { 231.0 }, { 232.0 } } }, { 233.0, 234.0 } }, { { { { 235.0 }, { 236.0 } }, { { 237.0 }, { 238.0 }, { 239.0 } }, { { 240.0 } }, { { 241.0 }, { 242.0 }, { 243.0 } } }, { 244.0, 245.0 } } } });
    double v3(246.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
