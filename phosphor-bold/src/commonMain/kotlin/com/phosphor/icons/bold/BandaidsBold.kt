package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.BandaidsBold: ImageVector
    get() {
        if (_BandaidsBold != null) {
            return _BandaidsBold!!
        }
        _BandaidsBold = ImageVector.Builder(
            name = "Bold.BandaidsBold",
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
                moveTo(49.37f, 94.63f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94.63f, 49.37f)
                lineToRelative(112f, 112f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -45.26f, 45.26f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(161.37f, 49.37f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 45.26f, 45.26f)
                lineToRelative(-112f, 112f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -45.26f, -45.26f)
                close()
            }
        }.build()

        return _BandaidsBold!!
    }

@Suppress("ObjectPropertyName")
private var _BandaidsBold: ImageVector? = null
