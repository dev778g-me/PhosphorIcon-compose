package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.MatrixLogoThin: ImageVector
    get() {
        if (_MatrixLogoThin != null) {
            return _MatrixLogoThin!!
        }
        _MatrixLogoThin = ImageVector.Builder(
            name = "Thin.MatrixLogoThin",
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
                moveTo(64f, 40f)
                lineToRelative(-24f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 40f)
                lineToRelative(24f, 0f)
                lineToRelative(0f, 176f)
                lineToRelative(-24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 160f)
                verticalLineTo(120f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 160f)
                verticalLineTo(120f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 96f)
                lineTo(80f, 160f)
            }
        }.build()

        return _MatrixLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _MatrixLogoThin: ImageVector? = null
