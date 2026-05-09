package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.ShuffleThin: ImageVector
    get() {
        if (_ShuffleThin != null) {
            return _ShuffleThin!!
        }
        _ShuffleThin = ImageVector.Builder(
            name = "Thin.ShuffleThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 72f)
                horizontalLineTo(55.06f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.08f, 26.8f)
                lineToRelative(41.72f, 58.4f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200.94f, 184f)
                horizontalLineTo(232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 48f)
                lineToRelative(24f, 24f)
                lineToRelative(-24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 160f)
                lineToRelative(24f, 24f)
                lineToRelative(-24f, 24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(147.66f, 100.47f)
                lineToRelative(1.2f, -1.67f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200.94f, 72f)
                horizontalLineTo(232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 184f)
                horizontalLineTo(55.06f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 52.08f, -26.8f)
                lineToRelative(1.2f, -1.67f)
            }
        }.build()

        return _ShuffleThin!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleThin: ImageVector? = null
