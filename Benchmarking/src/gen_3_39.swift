  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [Double]
    var p4: [[Double]]
    var p5: [[Double]]
  }
  struct s1 {
    var p0: s0
  }
  struct s4 {
    var p0: [s1]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s4]], _ v1: Double) -> Double {
    let v3: [s4] = v0[0]
    let v5: s4 = v3[0]
    let v7: s0 = v5.p1
    let v8: s0 = v5.p1
    let v17: [[Double]] = v8.p2
    let v50: [Double] = v17[0]
    let v24: [[Double]] = v7.p2
    let v20: Double = v50[0]
    let v72: [Double] = v24[0]
    var v67: [Double] = v72
    let v211: Double = v67[0]
    v67[0] = v20
    return v211
  }
  func benchmark() {
    let v0: [[s4]] = [[s4(p0: [s1(p0: s0(p0: [[0.0]], p1: [[1.0]], p2: [[2.0]], p3: [3.0, 4.0, 5.0], p4: [[6.0], [7.0], [8.0]], p5: [[9.0], [10.0], [11.0]])), s1(p0: s0(p0: [[12.0]], p1: [[13.0]], p2: [[14.0]], p3: [15.0, 16.0, 17.0], p4: [[18.0], [19.0], [20.0]], p5: [[21.0], [22.0], [23.0]])), s1(p0: s0(p0: [[24.0]], p1: [[25.0]], p2: [[26.0]], p3: [27.0, 28.0, 29.0], p4: [[30.0], [31.0], [32.0]], p5: [[33.0], [34.0], [35.0]]))], p1: s0(p0: [[36.0]], p1: [[37.0]], p2: [[38.0]], p3: [39.0, 40.0, 41.0], p4: [[42.0], [43.0], [44.0]], p5: [[45.0], [46.0], [47.0]]))]]
    let v1: Double = 48.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 48.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
