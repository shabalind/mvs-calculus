  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s4 {
    var p0: [[s1]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v3: s4 = v0[0]
    let v7: [[Double]] = v3.p1
    let v13: Double = v1 / v1
    var v30: Double = v13
    let v29: Double = v30 / v13
    var v41: Double = v29
    v30 = v1
    v30 = v1
    let v81: [Double] = v7[0]
    let v71: Double = v81[0]
    let v67: Double = v1 * v41
    let v152: Double = v41 + v71
    let v73: Double = v152 * v67
    return v73
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]], p2: [[3.0], [4.0], [5.0]], p3: [[6.0], [7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]], p2: [[12.0], [13.0], [14.0]], p3: [[15.0], [16.0], [17.0]]))]], p1: [[18.0], [19.0]])]
    let v1: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
