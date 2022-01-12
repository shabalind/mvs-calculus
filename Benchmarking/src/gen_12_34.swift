  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v8: Double = v1
    var v5: Double = v8
    let v17: Double = v8 * v8
    v8 = v17
    let v40: Double = v8 * v17
    let v41: [Double] = [v1, v40, v1, v1]
    let v18: Double = v8 - v5
    var v16: [Double] = v41
    v16[3] = v18
    v16[1] = v18
    let v42: Double = v18 - v8
    v16[2] = v42
    v16[0] = v5
    v16[0] = v42
    v16[1] = v8
    v16 = v41
    v16[3] = v1
    v16[3] = v1
    var v65: Double = v18
    var v37: [Double] = v41
    v37[2] = v42
    v37 = v16
    v16[1] = v17
    v37[2] = v40
    v37[0] = v65
    v37[1] = v8
    let v82: Double = v37[1]
    return v82
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]])], p1: [s1(p0: s0(p0: [[3.0]], p1: [[4.0], [5.0]]), p1: s0(p0: [[6.0]], p1: [[7.0], [8.0]])), s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0]])), s1(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: s0(p0: [[18.0]], p1: [[19.0], [20.0]]))])
    let v1: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
