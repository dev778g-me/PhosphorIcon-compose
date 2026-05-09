package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.InfinityDuotone: ImageVector
    get() {
        if (_InfinityDuotone != null) {
            return _InfinityDuotone!!
        }
        _InfinityDuotone = ImageVector.Builder(
            name = "Duotone.InfinityDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(97.94f, 161.94f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -67.88f)
                lineToRelative(60.12f, 67.88f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -67.88f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(106.63f, 152.13f)
                lineToRelative(-8.69f, 9.81f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -67.88f)
                lineToRelative(60.12f, 67.88f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -67.88f)
                lineToRelative(-8.69f, 9.81f)
            }
        }.build()

        return _InfinityDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _InfinityDuotone: ImageVector? = null
