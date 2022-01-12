  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v4: s3 = v0[1]
    let v3: s1 = v4.p1
    let v18: s0 = v3.p1
    let v10: [[Double]] = v18.p1
    let v23: s0 = v3.p1
    let v41: [[Double]] = v23.p0
    let v107: [[[Double]]] = [v10, v41]
    var v98: [[[Double]]] = v107
    let v145: [[Double]] = v98[0]
    let v138: [Double] = v145[0]
    let v81: Double = v138[0]
    return v81
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: s1(p0: [[s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]], p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]))), s3(p0: s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]]), p1: s1(p0: [[s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]], p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0], [35.0]])))]
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
