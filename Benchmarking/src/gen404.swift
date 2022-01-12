  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v3: [s0] = v0.p1
    var v7: Double = v1
    var v2: [s0] = v3
    let v4: s0 = v2[1]
    let v12: s0 = v2[0]
    let v9: [[Double]] = v4.p0
    let v13: [Double] = v9[0]
    v7 = v1
    let v27: Double = v13[0]
    v2[0] = v12
    var v42: Double = v7
    v42 = v27
    var v51: Double = v27
    var v104: Double = v42
    v104 = v51
    v42 = v27
    return v104
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]], p2: [[4.0], [5.0], [6.0]], p3: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0]], p1: [[11.0], [12.0], [13.0]], p2: [[14.0], [15.0], [16.0]], p3: [[17.0], [18.0], [19.0]])], p1: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]], p2: [[24.0], [25.0], [26.0]], p3: [[27.0], [28.0], [29.0]]), s0(p0: [[30.0]], p1: [[31.0], [32.0], [33.0]], p2: [[34.0], [35.0], [36.0]], p3: [[37.0], [38.0], [39.0]])])
    let v1: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
