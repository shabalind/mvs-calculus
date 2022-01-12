  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: [[s0]]
    var p3: [[s0]]
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  struct s5 {
    var p0: s1
    var p1: [s3]
  }
  func f94(_ v0: Double) -> Double {
    var v4: Double = v0
    var v1: Double = v0
    var v6: Double = v1
    var v7: Double = v1
    v7 = v1
    var v9: Double = v7
    var v3: Double = v1
    var v2: Double = v9
    var v5: Double = v4
    let v13: [Double] = [v9, v0, v4, v6]
    let v17: [[Double]] = [v13, v13, v13]
    v3 = v0
    let v10: [Double] = v17[0]
    let v14: [Double] = v17[0]
    var v18: [Double] = v14
    var v19: [Double] = v10
    let v35: Double = v18[2]
    v19[0] = v3
    let v30: Double = v14[0]
    let v41: [Double] = [v35, v2, v5]
    v18[3] = v30
    let v32: Double = v19[2]
    v7 = v32
    let v92: Double = v41[1]
    v18[3] = v0
    return v92
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s5, _ v2: Double) -> Double {
    let v4: [[Double]] = v0.p0
    let v20: [Double] = v4[0]
    let v61: Double = v20[0]
    let v41: Double = v61 / v2
    let v76: Double = f94(v61)
    let v39: Double = v76 - v41
    return v39
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [1.0, 2.0, 3.0])
    let v1: s5 = s5(p0: s1(p0: s0(p0: [[4.0]], p1: [5.0, 6.0, 7.0]), p1: [s0(p0: [[8.0]], p1: [9.0, 10.0, 11.0]), s0(p0: [[12.0]], p1: [13.0, 14.0, 15.0])], p2: [[s0(p0: [[16.0]], p1: [17.0, 18.0, 19.0])], [s0(p0: [[20.0]], p1: [21.0, 22.0, 23.0])]], p3: [[s0(p0: [[24.0]], p1: [25.0, 26.0, 27.0])], [s0(p0: [[28.0]], p1: [29.0, 30.0, 31.0])], [s0(p0: [[32.0]], p1: [33.0, 34.0, 35.0])]]), p1: [s3(p0: s0(p0: [[36.0]], p1: [37.0, 38.0, 39.0]), p1: s0(p0: [[40.0]], p1: [41.0, 42.0, 43.0])), s3(p0: s0(p0: [[44.0]], p1: [45.0, 46.0, 47.0]), p1: s0(p0: [[48.0]], p1: [49.0, 50.0, 51.0]))])
    let v2: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
