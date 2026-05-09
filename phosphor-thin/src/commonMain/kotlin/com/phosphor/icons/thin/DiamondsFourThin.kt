package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.DiamondsFourThin: ImageVector
    get() {
        if (_DiamondsFourThin != null) {
            return _DiamondsFourThin!!
        }
        _DiamondsFourThin = ImageVector.Builder(
            name = "Thin.DiamondsFourThin",
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
                moveTo(88.01f, 64f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88.01f, 192f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152.01f, 128f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24.01f, 128f)
                lineToRelative(40f, -40f)
                lineToRelative(40f, 40f)
                lineToRelative(-40f, 40f)
                close()
            }
        }.build()

        return _DiamondsFourThin!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondsFourThin: ImageVector? = null
