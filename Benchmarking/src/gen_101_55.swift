  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f1(_ v0: Double, _ v1: [s1]) -> Double {
    return v0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v4: Double = f1(v1, v0)
    let v6: [[s1]] = [v0, v0, v0, v0]
    var v3: Double = v4
    var v9: Double = v3
    var v22: [[s1]] = v6
    v22[3] = v0
    v22[0] = v0
    let v31: Double = f1(v9, v0)
    let v68: [s1] = v22[2]
    var v43: [[s1]] = v22
    let v40: Double = f1(v31, v68)
    v22 = v43
    return v40
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: [[4.0]]), p1: [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0]], p2: [[9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0]], p2: [[14.0]])]), s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0]], p2: [[19.0]]), p1: [s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0]], p2: [[24.0]]), s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0]], p2: [[29.0]])])]
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
