package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.StarOfDavidDuotone: ImageVector
    get() {
        if (_StarOfDavidDuotone != null) {
            return _StarOfDavidDuotone!!
        }
        _StarOfDavidDuotone = ImageVector.Builder(
            name = "Duotone.StarOfDavidDuotone",
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
                moveTo(192f, 128f)
                lineToRelative(32f, -56f)
                lineToRelative(-63.99f, 0.01f)
                lineToRelative(-32.01f, -56.01f)
                lineToRelative(-32.02f, 56.03f)
                lineToRelative(-63.98f, 0.01f)
                lineToRelative(31.98f, 55.96f)
                lineToRelative(-31.98f, 55.96f)
                lineToRelative(63.98f, 0.01f)
                lineToRelative(32.02f, 56.03f)
                lineToRelative(32.01f, -56.01f)
                lineToRelative(63.99f, 0.01f)
                lineToRelative(-32f, -56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 240f)
                lineToRelative(96f, -168f)
                lineToRelative(-192f, 0.04f)
                lineToRelative(96f, 167.96f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 16f)
                lineToRelative(96f, 168f)
                lineToRelative(-192f, -0.04f)
                lineToRelative(96f, -167.96f)
                close()
            }
        }.build()

        return _StarOfDavidDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _StarOfDavidDuotone: ImageVector? = null
