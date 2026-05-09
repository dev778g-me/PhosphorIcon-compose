package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.UniteSquareDuotone: ImageVector
    get() {
        if (_UniteSquareDuotone != null) {
            return _UniteSquareDuotone!!
        }
        _UniteSquareDuotone = ImageVector.Builder(
            name = "Duotone.UniteSquareDuotone",
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
                moveTo(96f, 216f)
                lineToRelative(120f, 0f)
                lineToRelative(0f, -120f)
                lineToRelative(-56f, 0f)
                lineToRelative(0f, -56f)
                lineToRelative(-120f, 0f)
                lineToRelative(0f, 120f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 216f)
                lineToRelative(120f, 0f)
                lineToRelative(0f, -120f)
                lineToRelative(-56f, 0f)
                lineToRelative(0f, -56f)
                lineToRelative(-120f, 0f)
                lineToRelative(0f, 120f)
                lineToRelative(56f, 0f)
                lineToRelative(0f, 56f)
                close()
            }
        }.build()

        return _UniteSquareDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _UniteSquareDuotone: ImageVector? = null
