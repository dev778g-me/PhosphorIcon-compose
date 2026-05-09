package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.LightbulbFilamentBold: ImageVector
    get() {
        if (_LightbulbFilamentBold != null) {
            return _LightbulbFilamentBold!!
        }
        _LightbulbFilamentBold = ImageVector.Builder(
            name = "Bold.LightbulbFilamentBold",
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
                moveTo(128f, 192f)
                lineTo(128f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 112f)
                lineToRelative(32f, 32f)
                lineToRelative(32f, -32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 232f)
                lineTo(168f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 168f)
                arcToRelative(79.86f, 79.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -63.53f)
                curveTo(47.76f, 61.09f, 82.72f, 25f, 126.07f, 24f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 49.77f, 144.1f)
                arcTo(19.81f, 19.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 184f)
                horizontalLineToRelative(0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineToRelative(-0.23f)
                arcTo(19.8f, 19.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 168f)
                close()
            }
        }.build()

        return _LightbulbFilamentBold!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbFilamentBold: ImageVector? = null
