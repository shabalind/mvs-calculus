  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s1
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [s0], _ v2: Double) -> Double {
    let v7: s0 = v1[0]
    let v5: [[Double]] = v7.p0
    var v3: [[Double]] = v5
    let v50: [Double] = v5[0]
    v3[1] = v50
    v3[1] = v50
    v3[2] = v50
    let v49: [Double] = v3[0]
    let v46: Double = v49[0]
    let v95: Double = v46 * v46
    return v95
  }
  func benchmark() {
    let v0: s3 = s3(p0: s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]), p1: s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), p1: [s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]))
    let v1: [s0] = [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0], [28.0], [29.0]])]
    let v2: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
