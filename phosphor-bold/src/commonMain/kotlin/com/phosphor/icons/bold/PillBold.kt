package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PillBold: ImageVector
    get() {
        if (_PillBold != null) {
            return _PillBold!!
        }
        _PillBold = ImageVector.Builder(
            name = "Bold.PillBold",
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
                moveTo(45.25f, 146.75f)
                lineTo(146.75f, 45.25f)
                arcTo(45.25f, 45.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 210.74f, 45.25f)
                lineTo(210.75f, 45.26f)
                arcTo(45.25f, 45.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 210.75f, 109.25f)
                lineTo(109.25f, 210.75f)
                arcTo(45.25f, 45.25f, 73.15f, isMoreThanHalf = false, isPositiveArc = true, 45.26f, 210.75f)
                lineTo(45.25f, 210.75f)
                arcTo(45.25f, 45.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 45.25f, 146.75f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 96f)
                lineTo(160f, 160f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 108f)
                lineTo(184f, 84f)
            }
        }.build()

        return _PillBold!!
    }

@Suppress("ObjectPropertyName")
private var _PillBold: ImageVector? = null
