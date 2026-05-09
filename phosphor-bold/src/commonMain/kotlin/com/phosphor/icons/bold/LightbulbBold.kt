package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.LightbulbBold: ImageVector
    get() {
        if (_LightbulbBold != null) {
            return _LightbulbBold!!
        }
        _LightbulbBold = ImageVector.Builder(
            name = "Bold.LightbulbBold",
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
                moveTo(88f, 232f)
                lineTo(168f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(78.7f, 167f)
                arcTo(79.87f, 79.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 104.45f)
                curveTo(47.76f, 61.09f, 82.72f, 25f, 126.07f, 24f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 51.34f, 142.9f)
                arcTo(24.3f, 24.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 186f)
                verticalLineToRelative(2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineToRelative(-2f)
                arcTo(24.11f, 24.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 78.7f, 167f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(140f, 70f)
                arcToRelative(36.39f, 36.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 30f)
            }
        }.build()

        return _LightbulbBold!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbBold: ImageVector? = null
