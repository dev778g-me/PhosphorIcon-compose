package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.LinuxLogoBold: ImageVector
    get() {
        if (_LinuxLogoBold != null) {
            return _LinuxLogoBold!!
        }
        _LinuxLogoBold = ImageVector.Builder(
            name = "Bold.LinuxLogoBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 208f)
                reflectiveCurveTo(64f, 168f, 64f, 88f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 0f)
                curveToRelative(0f, 80f, 32f, 120f, 32f, 120f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(104f, 104f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 104f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 144f)
                lineToRelative(-28f, 12f)
                lineToRelative(-28f, -12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(97.46f, 208f)
                arcToRelative(44.86f, 44.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.08f, 0f)
            }
        }.build()

        return _LinuxLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _LinuxLogoBold: ImageVector? = null
