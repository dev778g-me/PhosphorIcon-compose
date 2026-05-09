package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HeartHalfFill: ImageVector
    get() {
        if (_HeartHalfFill != null) {
            return _HeartHalfFill!!
        }
        _HeartHalfFill = ImageVector.Builder(
            name = "Filled.HeartHalfFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(178f, 40f)
                curveToRelative(-20.65f, 0f, -38.73f, 8.88f, -50f, 23.89f)
                curveTo(116.73f, 48.88f, 98.65f, 40f, 78f, 40f)
                arcToRelative(62.07f, 62.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -62f, 62f)
                curveToRelative(0f, 70f, 103.79f, 126.67f, 108.21f, 129f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.58f, 0f)
                curveTo(136.21f, 228.67f, 240f, 172f, 240f, 102f)
                arcTo(62.07f, 62.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 178f, 40f)
                close()
                moveTo(128f, 214.8f)
                verticalLineTo(104f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41.61f, -47.56f)
                arcTo(83.85f, 83.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 178f, 56f)
                arcToRelative(46.06f, 46.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 46f, 46f)
                curveTo(224f, 155.61f, 146.25f, 204.15f, 128f, 214.8f)
                close()
            }
        }.build()

        return _HeartHalfFill!!
    }

@Suppress("ObjectPropertyName")
private var _HeartHalfFill: ImageVector? = null
