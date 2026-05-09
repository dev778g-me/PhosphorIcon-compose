package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.EggCrackThin: ImageVector
    get() {
        if (_EggCrackThin != null) {
            return _EggCrackThin!!
        }
        _EggCrackThin = ImageVector.Builder(
            name = "Thin.EggCrackThin",
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
                moveTo(208f, 152f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                curveTo(48f, 88f, 96f, 24f, 128f, 24f)
                reflectiveCurveTo(208f, 88f, 208f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 152f)
                lineToRelative(8f, -40f)
                lineToRelative(-32f, -8f)
                lineToRelative(44.68f, -50.07f)
            }
        }.build()

        return _EggCrackThin!!
    }

@Suppress("ObjectPropertyName")
private var _EggCrackThin: ImageVector? = null
