  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: Double
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    var v4: Double = v1
    let v2: s3 = v0[1]
    let v3: s3 = v0[0]
    v4 = v1
    var v5: s3 = v2
    let v7: Double = v3.p0
    let v8: [s1] = v5.p1
    v5.p0 = v7
    var v18: Double = v7
    let v23: Double = v1 - v7
    v5.p1 = v8
    let v176: Double = v5.p0
    let v151: [Double] = [v4, v176, v23, v23, v18, v7]
    let v93: Double = v151[4]
    return v93
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: 0.0, p1: [s1(p0: s0(p0: [[1.0], [2.0], [3.0]], p1: [[4.0], [5.0]]), p1: s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0]])), s1(p0: s0(p0: [[11.0], [12.0], [13.0]], p1: [[14.0], [15.0]]), p1: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0], [20.0]])), s1(p0: s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0], [25.0]]), p1: s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0], [30.0]]))]), s3(p0: 31.0, p1: [s1(p0: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0], [36.0]]), p1: s0(p0: [[37.0], [38.0], [39.0]], p1: [[40.0], [41.0]])), s1(p0: s0(p0: [[42.0], [43.0], [44.0]], p1: [[45.0], [46.0]]), p1: s0(p0: [[47.0], [48.0], [49.0]], p1: [[50.0], [51.0]])), s1(p0: s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0], [56.0]]), p1: s0(p0: [[57.0], [58.0], [59.0]], p1: [[60.0], [61.0]]))])]
    let v1: Double = 62.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 62.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
