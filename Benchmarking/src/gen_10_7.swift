  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s3 {
    var p0: [[s0]]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v6: s3 = v0[1]
    let v3: s1 = v6.p1
    var v48: Double = v1
    let v30: [[s0]] = v3.p1
    var v19: [[s0]] = v30
    let v43: [s0] = v19[0]
    let v36: s0 = v43[0]
    let v54: [[Double]] = v36.p1
    var v71: [[Double]] = v54
    let v90: [Double] = v71[0]
    v71 = v54
    let v111: Double = v90[0]
    var v113: Double = v48
    let v66: Double = v111 * v113
    return v66
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])]], p1: s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: [[s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])]])), s3(p0: [[s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], [s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]], p1: s1(p0: s0(p0: [[30.0], [31.0]], p1: [[32.0], [33.0], [34.0]]), p1: [[s0(p0: [[35.0], [36.0]], p1: [[37.0], [38.0], [39.0]])]])), s3(p0: [[s0(p0: [[40.0], [41.0]], p1: [[42.0], [43.0], [44.0]])], [s0(p0: [[45.0], [46.0]], p1: [[47.0], [48.0], [49.0]])]], p1: s1(p0: s0(p0: [[50.0], [51.0]], p1: [[52.0], [53.0], [54.0]]), p1: [[s0(p0: [[55.0], [56.0]], p1: [[57.0], [58.0], [59.0]])]]))]
    let v1: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
